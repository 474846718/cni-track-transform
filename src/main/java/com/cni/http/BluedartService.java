package com.cni.http;

import com.cni.pojo.company.BluedartXmlPojo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Bluedart公司原生API
 * <p>
 * 该公司返回的数据是XML格式，所以需要使用Xml的方式进行序列化与反序列化
 * <p>
 * Created by CNI on 2018/1/15.
 */
// http://www.bluedart.com
public interface BluedartService {

    /**
     * http://www.bluedart.com/servlet/RoutingServlet
     * ?handler=tnt
     * &action=custawbquery
     * &loginid=BOM06862
     * &awb=awb
     * &numbers=59638108526
     * &lickey=3591556c28df4decdd839d53c8f9b839
     * &verno=1.3
     * &scan=1
     */
    @GET("/servlet/RoutingServlet")
    Call<BluedartXmlPojo> trackingPage(
            @Query("handler") String handler,
            @Query("action") String action,
            @Query("loginid") String loginId,
            @Query("awb") String awb,
            @Query("numbers") String numbers,
            @Query("lickey") String licenseKey,
            @Query("verno") String versionNum,
            @Query("scan") String bScan
    );

}
