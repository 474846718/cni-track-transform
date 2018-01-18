package com.cni.company;

import com.cni.pojo.Waybill;
import com.cni.pojo.company.DelhiveryJsonPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Delhivery公司
 * <p>
 * Created by CNI on 2018/1/17.
 */
@Component
public class Delhivery extends AbstractMatcher implements ApiConverter<DelhiveryJsonPojo>{

    @Value("${company.delhivery.regex}")
    private String regex;

    @Override
    protected String getRegexPattern() {
        return regex;
    }

    @Override
    public Waybill convert(DelhiveryJsonPojo data) {
        return null;
    }
}
