package com.wstone;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by shiwei on 2018/8/1.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigApp {

    public static void main(String []args){
        new SpringApplicationBuilder(ConfigApp.class).web(WebApplicationType.NONE).run(args);
    }

}
