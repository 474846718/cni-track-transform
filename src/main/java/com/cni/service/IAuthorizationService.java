package com.cni.service;

import com.cni.pojo.CommonResponse;

import javax.servlet.http.HttpSession;

/**
 * 认证服务
 * <p>
 * Created by CNI on 2018/2/1.
 */
public interface IAuthorizationService {

    CommonResponse login(HttpSession session, String user, String password);

    boolean checkToken(HttpSession session, String token);

}
