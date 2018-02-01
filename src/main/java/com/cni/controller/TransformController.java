package com.cni.controller;

import com.cni.http.impl.NotFoundException;
import com.cni.pojo.*;
import com.cni.service.IAuthorizationService;
import com.cni.service.ITransformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * 将原生API转JSON格式
 * <p>
 * Created by CNI on 2018/1/22.
 */
@RestController
@RequestMapping("/v1.0.0")
public class TransformController {

    @Autowired
    private ITransformService transformService;

    @Autowired
    private IAuthorizationService authorizationService;

    @PostMapping("/login")
    public Object login(HttpSession session, String user, String password) {
        return authorizationService.login(session, user, password);
    }

    @RequestMapping(value = "/bluedart", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object bluedart(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            BluedartXmlPojo bluedartXmlPojo = transformService.transformBluedart(orderNum);
            return CommonResponse.success("原生API调用成功", bluedartXmlPojo);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

    @RequestMapping(value = "/delhivery", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object delhivery(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            DelhiveryJsonPojo delhiveryJsonPojo = transformService.transformDelhivery(orderNum);
            return CommonResponse.success("原生API调用成功", delhiveryJsonPojo);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

    @RequestMapping(value = "/ecom", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object ecomExpress(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            EcomXmlPojo ecomXmlPojo = transformService.transformEcomExpress(orderNum);
            return CommonResponse.success("原生API调用成功", ecomXmlPojo);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

    @RequestMapping(value = "/neoman", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object neoman(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            NeomanInvalidXmlPojo neomanInvalidXmlPojo = transformService.transformNeoman(orderNum);
            return CommonResponse.success("原生API调用成功", neomanInvalidXmlPojo);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

    @RequestMapping(value = "/gati", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object gati(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            GatiJsonPojo gatiJsonPojo = transformService.transformGati(orderNum);
            return CommonResponse.success("原生API调用成功", gatiJsonPojo);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

    @RequestMapping(value = "/indiapost", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object indiapost(
            @RequestHeader("Authorization") String token,
            @RequestParam("orderNum") String orderNum,
            HttpSession session) {
        if (!authorizationService.checkToken(session, token)) {
            return CommonResponse.error("400", "token有误");
        }
        try {
            IndiapostHtmlPojo indiapostHtmlPojo = transformService.transformIndiaport(orderNum);
            indiapostHtmlPojo.setAwb(orderNum);
            return CommonResponse.success("原生API调用成功", indiapostHtmlPojo);
        } catch (NotFoundException nfe) {
            return CommonResponse.error("400", "查无此单", orderNum);
        } catch (Exception e) {
            e.printStackTrace();
            return CommonResponse.error("出现异常", e);
        }
    }

}
