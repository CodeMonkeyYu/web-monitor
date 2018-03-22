package com.gdtopway.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController
 */
@RestController
public class MainController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/main")
    public String Version(){
        return "The port is " + port;
    }
    
}