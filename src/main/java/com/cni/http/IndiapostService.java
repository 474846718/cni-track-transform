package com.cni.http;

import com.cni.http.impl.NotFoundException;
import com.cni.pojo.IndiapostHtmlPojo;

import java.io.IOException;

/**
 * indiapost服务
 * <p>
 * Created by CNI on 2018/1/24.
 */
public interface IndiapostService {

    String getToken(String awb) throws IOException;

    String getHtml(String token) throws IOException;

    IndiapostHtmlPojo transform(String html) throws NotFoundException;

}
