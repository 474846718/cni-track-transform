package com.cni.http;

import com.cni.pojo.EcomExpressXmlPojo;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * EcomExpress公司要提供的接口
 * <p>
 * Created by CNI on 2018/1/16.
 */
public interface EcomExpressService {

    /**
     * http://plapi.ecomexpress.in/track_me/api/mawbd/?
     * awb=221550310,223390321&
     * order=&
     * username=sino151328&
     * password=sned53emv28dve
     */
    @POST("/track_me/api/mawbd/")
    Call<EcomExpressXmlPojo> trackingPage(@Query("awb") String awb,
                                          @Query("order") String order,
                                          @Query("username") String username,
                                          @Query("password") String password);
}
