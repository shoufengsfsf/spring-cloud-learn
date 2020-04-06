package com.shoufeng.eureka.client.provider.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
//开启eureka client
@EnableEurekaClient
public class EurekaClientProviderDemo02Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProviderDemo02Application.class, args);
    }
}