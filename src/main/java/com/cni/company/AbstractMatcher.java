package com.cni.company;

/**
 * 因为使用正则进行匹配，正则再properties文件中配置，实现一致
 * <p>
 * Created by CNI on 2018/1/17.
 */
public abstract class AbstractMatcher implements OrderNumberMatcher {

    protected abstract String getRegexPattern();

    @Override
    public boolean match(String orderNum) {
        return orderNum != null && orderNum.matches(getRegexPattern());
    }
}
