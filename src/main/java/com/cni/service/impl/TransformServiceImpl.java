package com.cni.service.impl;

import com.cni.http.*;
import com.cni.http.impl.NotFoundException;
import com.cni.pojo.*;
import com.cni.service.ITransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * 转换业务
 * <p>
 * Created by CNI on 2018/1/22.
 */
@Service
public class TransformServiceImpl implements ITransformService {

    @Autowired
    private BluedartService bluedartService;

    @Autowired
    private DelhiveryService delhiveryService;

    @Autowired
    private EcomExpressService ecomExpressService;

    @Autowired
    private NeomanService neomanService;

    @Autowired
    private GatiService gatiService;

    @Autowired
    private IndiapostService indiapostService;


    @Override
    public BluedartXmlPojo transformBluedart(String orderNum) throws IOException {
        Call<BluedartXmlPojo> call = bluedartService.trackingPage("tnt", "custawbquery", "BOM06862", "awb", orderNum, "3591556c28df4decdd839d53c8f9b839", "1.3", "1");
        Response<BluedartXmlPojo> response = call.execute();
        return response.body();
    }

    @Override
    public DelhiveryJsonPojo transformDelhivery(String orderNum) throws IOException {
        Call<DelhiveryJsonPojo> call = delhiveryService.trackingPage(orderNum);
        Response<DelhiveryJsonPojo> response = call.execute();
        return response.body();
    }

    @Override
    public EcomExpressXmlPojo transformEcomExpress(String orderNum) throws IOException {
        Call<EcomExpressXmlPojo> call = ecomExpressService.trackingPage(orderNum, "", "sino151328", "sned53emv28dve");
        Response<EcomExpressXmlPojo> response = call.execute();
        return response.body();
    }

    @Override
    public NeomanInvalidXmlPojo transformNeoman(String orderNum) throws IOException {
        Call<NeomanInvalidXmlPojo> call = neomanService.trackingPage(orderNum);
        Response<NeomanInvalidXmlPojo> response = call.execute();
        return response.body();
    }

    @Override
    public GatiJsonPojo transformGati(String orderNum) throws IOException {
        // gati原生API要求提供的多个单号要以空格分隔
        orderNum = orderNum.replace(',', ' ');
        Call<GatiJsonPojo> call = gatiService.trackingPage(orderNum, "100");
        Response<GatiJsonPojo> response = call.execute();
        return response.body();
    }

    @Override
    public IndiapostHtmlPojo transformIndiaport(String orderNum) throws IOException, NotFoundException {
        String token = indiapostService.getToken(orderNum);
        String html = indiapostService.getHtml(token);
        return indiapostService.transform(html);
    }
}
