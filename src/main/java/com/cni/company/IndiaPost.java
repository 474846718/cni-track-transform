package com.cni.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * IndiaPost公司
 * <p>
 * Created by CNI on 2018/1/17.
 */
@Component
public class IndiaPost extends AbstractMatcher {

    @Value("${company.indiapost.regex}")
    private String regex;

    @Override
    protected String getRegexPattern() {
        return regex;
    }
}
