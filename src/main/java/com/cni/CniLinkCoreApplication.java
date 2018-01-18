package com.cni;

import okhttp3.OkHttpClient;
import org.apache.commons.io.IOUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class CniLinkCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CniLinkCoreApplication.class, args);
    }


    @Configuration
    public static class BeanConfig implements ResourceLoaderAware {
        private ResourceLoader resourceLoader;

        @Bean
        public String json() throws IOException {
            Resource resource = resourceLoader.getResource("classpath:map_config.json");
            return IOUtils.toString(resource.getInputStream(), StandardCharsets.UTF_8);
        }

        @Bean
        public Retrofit externalService() {
            OkHttpClient client = new OkHttpClient.Builder()
                    .connectTimeout(100, TimeUnit.SECONDS)
                    .readTimeout(100, TimeUnit.SECONDS)
                    .build();
            return new Retrofit.Builder()
                    .baseUrl("http://47.91.212.1:9090")
                    .addConverterFactory(JacksonConverterFactory.create())
                    .client(client)
                    .build();
        }

        @Override
        public void setResourceLoader(ResourceLoader resourceLoader) {
            this.resourceLoader = resourceLoader;
        }
    }

}
