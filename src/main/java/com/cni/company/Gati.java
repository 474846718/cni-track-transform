package com.cni.company;

import org.springframework.beans.factory.annotation.Value;

/**
 * Gati公司
 * <p>
 * Created by CNI on 2018/1/17.
 */
public class Gati extends AbstractMatcher {

    @Value("${company.gati.regex}")
    private String regex;

    @Override
    protected String getRegexPattern() {
        return regex;
    }
}
