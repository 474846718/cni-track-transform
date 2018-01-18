package com.cni.http;

import com.cni.pojo.company.DelhiveryJsonPojo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Delhivery公司JSON接口
 * <p>
 * https://g5m2dkib88.execute-api.ap-southeast-1.amazonaws.com/Prod/track
 * ?waybillId=1521510113890,1521512433804,1521511465785,1521511829914,1521512421484,1521500406510,1521511105996,1521512409816,1521510525873,1521512516124,1521511315016
 * <p>
 * Created by CNI on 2018/1/16.
 */
public interface DelhiveryService {

    /**
     * waybillId=1521510113890,1521512433804,1521511465785,1521511829914,
     * 1521512421484,1521500406510,1521511105996,1521512409816,1521510525873,
     * 1521512516124,1521511315016
     *
     * @param waybillId 支持多单查询
     */
    @GET("/Prod/track")
    Call<DelhiveryJsonPojo> trackingPage(@Query("waybillId") String waybillId);

}
