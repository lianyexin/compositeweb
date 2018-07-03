package com.wstone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by shiwei on 2018/7/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class webApp {

    public static void main(String []args){
        SpringApplication.run(webApp.class).start();
    }

}
