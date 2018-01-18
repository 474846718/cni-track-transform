package com.cni.company;

import com.cni.pojo.Waybill;
import com.cni.pojo.external.BluedartResponsePojo;
import com.jayway.jsonpath.JsonPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Bluedart公司的相关业务实现
 * <p>
 * Created by CNI on 2018/1/17.
 */
@Component
public class Bluedart extends AbstractMatcher implements ApiConverter<BluedartResponsePojo> {

    @Value("${company.bluedart.regex}")
    private String regex;

    @Override
    protected String getRegexPattern() {
        return regex;
    }

    @Autowired
    private String json;

    @Override
    public Waybill convert(BluedartResponsePojo data) {
        JsonPath.read(json, "$['BLUE_DART']");
        return null;
    }
}
