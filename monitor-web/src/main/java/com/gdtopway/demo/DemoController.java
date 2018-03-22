package com.gdtopway.demo;

import com.gdtopway.remote.monitor.worker.MainRemote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 */
@RestController
public class DemoController {

    @Autowired
    MainRemote mainRemote;
    
    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name")String name){
        return mainRemote.Version();
    }
}