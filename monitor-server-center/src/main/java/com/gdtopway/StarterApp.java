package com.gdtopway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StarterApp {

    public static void main(String[] args) {
        SpringApplication.run(StarterApp.class,args);    
    }    
}