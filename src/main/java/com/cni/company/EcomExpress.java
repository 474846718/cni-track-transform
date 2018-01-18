package com.cni.company;

import com.cni.pojo.Waybill;
import com.cni.pojo.company.EcomExpressXmlPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * EcomExpress公司
 * <p>
 * Created by CNI on 2018/1/17.
 */
@Component
public class EcomExpress extends AbstractMatcher implements ApiConverter<EcomExpressXmlPojo>{

    @Value("${company.ecomexpress.regex}")
    private String regex;

    @Override
    protected String getRegexPattern() {
        return regex;
    }

    @Override
    public Waybill convert(EcomExpressXmlPojo data) {
        return null;
    }
}
