package com.cni;

import com.cni.http.BluedartService;
import com.cni.http.DelhiveryService;
import com.cni.http.ExternalTraceService;
import com.cni.http.NeomanService;
import com.cni.http.convert.NeomanPojoConverterFactory;
import com.cni.pojo.BluedartXmlShipmentData;
import com.cni.pojo.DelhiveryJsonPojo;
import com.cni.pojo.NeomanInvalidXmlPojo;
import com.cni.pojo.external.CommonResult;
import com.cni.pojo.external.RequestPojo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.jaxb.XmlJaxbAnnotationIntrospector;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CniLinkCoreApplicationTests {

    @Test
    public void testExternalTraceService() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://47.91.212.1:9090")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        ExternalTraceService service = retrofit.create(ExternalTraceService.class);
        Call<CommonResult> login = service.userLogin("traceuser001", "extTraceHK258147");
        Response<CommonResult> loginResponse = login.execute();
        if (loginResponse.isSuccessful()) {
            CommonResult body = loginResponse.body();
            boolean success = body.isSuccess();
            System.out.println(success);
            System.out.println(body);
            String token = (String) body.getInfo();

            RequestPojo requestPojo = new RequestPojo();
            requestPojo.setType("awb");
            requestPojo.setAwb("59638108526,59639940754");
            Call<CommonResult> trackingPage = service.trackingPage(token, "bluedart", requestPojo);
            Response<CommonResult> result = trackingPage.execute();
            if (result.isSuccessful()) {
                CommonResult resultPojo = result.body();
                System.out.println(resultPojo);
            }
        }
    }

    @Test
    public void testBluedartService() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        XmlJaxbAnnotationIntrospector introspector = new XmlJaxbAnnotationIntrospector(TypeFactory.defaultInstance());
        xmlMapper.setAnnotationIntrospector(introspector);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bluedart.com")
                .addConverterFactory(JacksonConverterFactory.create(xmlMapper))
                .build();
        BluedartService service = retrofit.create(BluedartService.class);
        Call<BluedartXmlShipmentData> trackingPage = service.trackingPage("tnt", "custawbquery", "BOM06862", "awb", "59638108526", "3591556c28df4decdd839d53c8f9b839", "1.3", "1");
        Response<BluedartXmlShipmentData> response = trackingPage.execute();
        if (response.isSuccessful()) {
            BluedartXmlShipmentData body = response.body();
            System.out.println(body);
        }
    }


    @Test
    public void testDelhiveryService() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://g5m2dkib88.execute-api.ap-southeast-1.amazonaws.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        DelhiveryService service = retrofit.create(DelhiveryService.class);
        Call<DelhiveryJsonPojo> trackingPage = service.trackingPage("1521510113890,1521512433804,1521511465785,1521511829914");
        Response<DelhiveryJsonPojo> response = trackingPage.execute();
        if (response.isSuccessful()) {
            DelhiveryJsonPojo body = response.body();
            System.out.println(body);
        }
    }

    @Test
    public void testNeomanService() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://120.78.89.247")
                .addConverterFactory(NeomanPojoConverterFactory.create())
                .build();
        NeomanService service = retrofit.create(NeomanService.class);
        Call<NeomanInvalidXmlPojo> trackingPage = service.trackingPage("1521510860926");
        Response<NeomanInvalidXmlPojo> response = trackingPage.execute();
        if (response.isSuccessful()) {
            NeomanInvalidXmlPojo pojo = response.body();
            System.out.println(pojo);
        }
    }

}
