package com.cni.service.impl;

import com.cni.pojo.TrackRequestPojo;
import com.cni.pojo.Waybill;
import com.cni.service.ITrackService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 核心查单业务实现类
 * <p>
 * Created by CNI on 2018/1/17.
 */
@Service
public class TrackServiceImpl implements ITrackService {


    /**
     * 查单业务实现
     *
     * @param trackRequest 查单请求(可能包含多个单号)
     * @return 查单结果
     */
    @Override
    public List<Waybill> track(TrackRequestPojo trackRequest) {
        BlockingQueue<Waybill> queue = new ArrayBlockingQueue<>(trackRequest.getWaybills().length);

        return null;
    }
}
