package com.cni.controller;

import com.cni.pojo.TrackRequestPojo;
import com.cni.pojo.Waybill;
import com.cni.service.ITrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * 核心的查单业务
 * <p>
 * Created by CNI on 2018/1/17.
 */
@CrossOrigin(origins = "*", maxAge = 3600) //标记为支持跨域
@RestController
public class CniCoreTrackController {

    @Autowired
    private ITrackService trackService;

    @PostMapping("/get_waybills")
    public List<Waybill> getWaybills(@RequestBody TrackRequestPojo trackRequest) {
        try {
            return trackService.track(trackRequest);
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
