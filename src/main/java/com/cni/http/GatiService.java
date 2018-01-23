package com.cni.http;

import com.cni.pojo.GatiJsonPojo;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Gati原生API
 * <p>
 * http://www.gaticn.com/api/v1/track/queryByTrackNum?trackNums=661086868%0A661086882%0A661125807&ntype=100
 * <p>
 * Created by CNI on 2018/1/23.
 */
public interface GatiService {

    /**
     * trackNums=661086868%0A661086882%0A661125807&ntype=100
     *
     * @param trackNums 多个单号以空格分割
     * @param nType     100
     */
    @POST
    Call<GatiJsonPojo> trackingPage(@Query("trackNums") String trackNums,
                                    @Query("ntype") String nType);

}
