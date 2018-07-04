package com.wstone;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by shiwei on 2018/7/3.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApp {

        public static void main(String[] args) {
            SpringApplication.run(ServerApp.class, args);
        }


}
