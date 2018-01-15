package com.cni.pojo;

/**
 * 请求参数
 * 示例：
 * {"awb":"59638108526,59639940754","type":"awb"}
 * <p>
 * Created by CNI on 2018/1/9.
 * <p>
 * Author：胡飞飞
 */
public class RequestPojo {

    /**
     * awb : 59638108526,59639940754
     * type : awb
     */

    private String awb;
    private String type;

    /**
     * 单号
     * 多个单号以逗号隔开：
     * 59638108526,59639940754
     */
    public String getAwb() {
        return awb;
    }

    public void setAwb(String awb) {
        this.awb = awb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
