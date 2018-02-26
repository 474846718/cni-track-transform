package com.cni.convert;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/**
 * 对EcomExpress公司提供的数据进行转换
 * <p>
 * Created by CNI on 2018/1/16.
 */

public class EcomExpressConverterFactory extends Converter.Factory {

    private EcomExpressConverterFactory() {
    }

    @Override
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotations, Retrofit retrofit) {
        return new EcomExpressResponseBodyConverter();
    }

    public static EcomExpressConverterFactory create() {
        return new EcomExpressConverterFactory();
    }
}
