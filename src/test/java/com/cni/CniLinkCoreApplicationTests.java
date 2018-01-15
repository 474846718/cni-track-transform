package com.cni;

import com.cni.http.ExternalTraceService;
import com.cni.pojo.RequestPojo;
import com.cni.pojo.external.CommonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

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
    public void testBluedartService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bluedart.com")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
    }

}
