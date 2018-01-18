package com.cni.service;

import com.cni.pojo.TrackRequestPojo;
import com.cni.pojo.Waybill;

import java.util.List;

/**
 * 实现查单业务
 * <p>
 * Created by CNI on 2018/1/17.
 */
public interface ITrackService {

    List<Waybill> track(TrackRequestPojo trackRequest);

}
