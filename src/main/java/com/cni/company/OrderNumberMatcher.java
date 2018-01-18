package com.cni.company;

/**
 * 匹配订单号的匹配器
 * <p>
 * Created by CNI on 2018/1/17.
 */
public interface OrderNumberMatcher {

    /**
     * 单号是否能匹配该公司的规则
     *
     * @param orderNum 单号
     */
    boolean match(String orderNum);

}
