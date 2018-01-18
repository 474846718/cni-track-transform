package com.cni.http;

import com.cni.pojo.company.NeomanInvalidXmlPojo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Neoman SB公司的老古董CGI接口
 * <p>
 * 钮门网络科技
 * <p>
 * Created by CNI on 2018/1/16.
 * <p>
 * Author:胡飞飞
 */
public interface NeomanService {

    @GET("/cgi-bin/GInfo.dll?EmsApiTrack")
    Call<NeomanInvalidXmlPojo> trackingPage(@Query("cno") String cno);
}
