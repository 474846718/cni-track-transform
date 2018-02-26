package com.cni;

import com.cni.convert.EcomExpressConverterFactory;
import com.cni.convert.NeomanPojoConverterFactory;
import com.cni.http.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.jaxb.XmlJaxbAnnotationIntrospector;
import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class CniLinkCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CniLinkCoreApplication.class, args);
    }

    @Configuration
    public static class BeanConfig {

        @Bean
        public OkHttpClient httpClient() {
            return new OkHttpClient.Builder()
                    .readTimeout(30, TimeUnit.SECONDS)
                    .connectTimeout(30, TimeUnit.SECONDS)
                    .retryOnConnectionFailure(true)
                    .build();
        }

        @Bean
        public BluedartService bluedartService(OkHttpClient client) {
            XmlMapper xmlMapper = new XmlMapper();
            XmlJaxbAnnotationIntrospector introspector = new XmlJaxbAnnotationIntrospector(TypeFactory.defaultInstance());
            xmlMapper.setAnnotationIntrospector(introspector);
            return new Retrofit.Builder()
                    .baseUrl("http://www.bluedart.com")
                    .client(client)
                    .addConverterFactory(JacksonConverterFactory.create(xmlMapper))
                    .build()
                    .create(BluedartService.class);
        }

        @Bean
        public DelhiveryService delhiveryService(OkHttpClient client) {
            return new Retrofit.Builder()
                    .baseUrl("https://g5m2dkib88.execute-api.ap-southeast-1.amazonaws.com")
                    .client(client)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build()
                    .create(DelhiveryService.class);
        }

        @Bean
        public EcomExpressService ecomExpressService(OkHttpClient client) {
            return new Retrofit.Builder()
                    .baseUrl("http://plapi.ecomexpress.in/track_me/api/mawbd/")
                    .client(client)
                    .addConverterFactory(EcomExpressConverterFactory.create())
                    .build()
                    .create(EcomExpressService.class);
        }

        @Bean
        public NeomanService neomanService(OkHttpClient client) {
            return new Retrofit.Builder()
                    .baseUrl("http://120.78.89.247")
                    .client(client)
                    .addConverterFactory(NeomanPojoConverterFactory.create())
                    .build()
                    .create(NeomanService.class);
        }

        @Bean
        public GatiService gatiService(OkHttpClient client) {
            return new Retrofit.Builder()
                    .baseUrl("http://www.gaticn.com")
                    .client(client)
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build()
                    .create(GatiService.class);
        }
    }
}
