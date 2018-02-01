package com.cni;

import com.cni.convert.EcomExpressConverterFactory;
import com.cni.convert.NeomanPojoConverterFactory;
import com.cni.http.BluedartService;
import com.cni.http.DelhiveryService;
import com.cni.http.EcomExpressService;
import com.cni.http.NeomanService;
import com.cni.pojo.BluedartXmlPojo;
import com.cni.pojo.DelhiveryJsonPojo;
import com.cni.pojo.EcomXmlPojo;
import com.cni.pojo.NeomanInvalidXmlPojo;
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
    public void testBluedartService() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        XmlJaxbAnnotationIntrospector introspector = new XmlJaxbAnnotationIntrospector(TypeFactory.defaultInstance());
        xmlMapper.setAnnotationIntrospector(introspector);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.bluedart.com")
                .addConverterFactory(JacksonConverterFactory.create(xmlMapper))
                .build();
        BluedartService service = retrofit.create(BluedartService.class);
        Call<BluedartXmlPojo> trackingPage = service.trackingPage("tnt", "custawbquery", "BOM06862", "awb", "59638108526", "3591556c28df4decdd839d53c8f9b839", "1.3", "1");
        Response<BluedartXmlPojo> response = trackingPage.execute();
        if (response.isSuccessful()) {
            BluedartXmlPojo body = response.body();
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

    @Test
    public void testEcomExpressService() throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://plapi.ecomexpress.in")
                .addConverterFactory(EcomExpressConverterFactory.create())
                .build();
        EcomExpressService service = retrofit.create(EcomExpressService.class);
        Call<EcomXmlPojo> trackingPage = service.trackingPage("221550310,223390321", "", "sino151328", "sned53emv28dve");
        Response<EcomXmlPojo> response = trackingPage.execute();
        if (response.isSuccessful()) {
            EcomXmlPojo pojo = response.body();
            System.out.println(pojo);
        }
    }

}
