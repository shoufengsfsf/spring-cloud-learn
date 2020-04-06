package com.shoufeng.eureka.server.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shoufeng
 */
@SpringBootApplication
//开启eureka server
@EnableEurekaServer
public class EurekaServerDemo01Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerDemo01Application.class, args);
    }
}
