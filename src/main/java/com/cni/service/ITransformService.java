package com.cni.service;

import com.cni.pojo.*;

import java.io.IOException;

/**
 * 实现查单业务
 * <p>
 * Created by CNI on 2018/1/17.
 */
public interface ITransformService {

    BluedartXmlPojo transformBluedart(String orderNum) throws IOException;

    DelhiveryJsonPojo transformDelhivery(String orderNum) throws IOException;

    EcomExpressXmlPojo transformEcomExpress(String orderNum) throws IOException;

    NeomanInvalidXmlPojo transformNeoman(String orderNum) throws IOException;

    GatiJsonPojo transformGati(String orderNum) throws IOException;
}
