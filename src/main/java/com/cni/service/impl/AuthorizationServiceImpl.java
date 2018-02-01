package com.cni.service.impl;

import com.cni.pojo.CommonResponse;
import com.cni.service.IAuthorizationService;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * 认证服务实现
 * <p>
 * Created by CNI on 2018/2/1.
 */
@Service
public class AuthorizationServiceImpl implements IAuthorizationService {

    private static final String SESSION_KEY_TOKEN = "_session_token_key_";

    @Override
    public CommonResponse login(HttpSession session, String user, String password) {
        if ("traceuser001".equals(user) && "extTraceHK258147".equals(password)) {
            @SuppressWarnings("deprecation")
            String token = RandomStringUtils.randomAlphanumeric(32);
            session.setAttribute(SESSION_KEY_TOKEN, token);
            return CommonResponse.success("登录成功", token);
        } else {
            return CommonResponse.error("401", "登陆失败");
        }
    }

    @Override
    public boolean checkToken(HttpSession session, String token) {
        Object sessionToken = session.getAttribute(SESSION_KEY_TOKEN);
        return !StringUtils.isEmpty(token) && token.equals(sessionToken);
    }
}
