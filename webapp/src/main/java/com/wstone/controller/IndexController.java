package com.wstone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.System.out;
/**
 * Created by shiwei on 2018/11/8.
 */
@RestController
@RequestMapping(value = "/index")
@ConfigurationProperties
public class IndexController {
    @Value("${spring.rabbitmq.host}")
    private String ip;

    @RequestMapping(value = "/ip")
    public String getIpAdress(){
        out.println("RabittMQ host:"+ip);
        return ip;
    }

}
