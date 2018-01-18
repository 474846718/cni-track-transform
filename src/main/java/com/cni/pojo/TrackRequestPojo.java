package com.cni.pojo;

/**
 * 查单请求
 * <p>
 * Created by CNI on 2018/1/17.
 */
public class TrackRequestPojo {

    private String token;

    private String[] waybills;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String[] getWaybills() {
        return waybills;
    }

    public void setWaybills(String[] waybills) {
        this.waybills = waybills;
    }
}
