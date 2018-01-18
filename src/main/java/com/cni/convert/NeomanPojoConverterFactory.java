package com.cni.convert;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * 用于将Neoman公司的API请求得到的字符串解析成java对象
 * <p>
 * Created by CNI on 2018/1/16.
 */
public class NeomanPojoConverterFactory extends Converter.Factory {

    private NeomanPojoConverterFactory() {
    }

    public static NeomanPojoConverterFactory create() {
        return new NeomanPojoConverterFactory();
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new NeomanResponseBodyConverter();
    }

}
