package com.cni.pojo.external;

/**
 * Created by CNI on 2018/1/18.
 */
public class GatiRequestPojo {


    /**
     * p1 : 661125807
     * p2 : 5087CD460E2AC5E6
     */

    /**
     * 单号(允许多单查询)
     */
    private String p1;
    /**
     * token
     */
    private String p2 = "5087CD460E2AC5E6";

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }
}
