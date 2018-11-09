package com.wstone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by shiwei on 2018/7/3.
 */
@SpringBootApplication
@EnableEurekaClient
public class WebApp {

    public static void main(String []args){
        SpringApplication.run(WebApp.class).start();
    }

}
