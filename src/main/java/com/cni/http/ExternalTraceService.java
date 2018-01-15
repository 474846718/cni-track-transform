package com.cni.http;

import com.cni.pojo.external.CommonResult;
import com.cni.pojo.RequestPojo;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * 调用外部查询服务
 * <p>
 * 目前服务地址为：47.91.212.1:9090
 * <p>
 * Created by CNI on 2018/1/9.
 * <p>
 * Author：胡飞飞
 */
public interface ExternalTraceService {

    /**
     * 查询订单
     *
     * @param authorization 用户token(放在Http请求头中)
     * @param company       查询订单的服务商公司
     *                      bluedart,ecom,delhivery,indiapost,gati
     * @param requestParam  查询参数
     * @return 返回订单信息
     */
    @POST("/v1.0.0/{company}/trackingPage")
    Call<CommonResult> trackingPage(@Header("Authorization") String authorization,
                                    @Path("company") String company,
                                    @Body RequestPojo requestParam);

    /**
     * 用户登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 返回CommonResult中的info包含登陆后的TOKEN
     * POST：
     * http://47.91.212.1:9090/v1.0.0/user/userLogin?userName=traceuser001&password=extTraceHK258147
     * Response：
     * {
     * "code": "200",
     * "message": "成功",
     * "info": "YjZiZTY3ZDdhMWRmZmRjZjY2M2Q4NWY5MjQzMWYyM2U=",
     * "success": true
     * }
     */
    @POST("/v1.0.0/user/userLogin")
    Call<CommonResult> userLogin(@Query("userName") String userName,
                                 @Query("password") String password);
}
