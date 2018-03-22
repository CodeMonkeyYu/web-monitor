package com.gdtopway.remote.monitor.worker;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * MainRemote
 */
@FeignClient(name="monitor-worker")
public interface MainRemote {
    @RequestMapping("/main")
    String Version();
}