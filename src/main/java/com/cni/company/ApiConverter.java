package com.cni.company;

import com.cni.pojo.Waybill;

/**
 * 将其他公司的接口返回的数据转换为统一的返回格式
 * <p>
 * Created by CNI on 2018/1/17.
 */
public interface ApiConverter<T> {

    Waybill convert(T data);

}
