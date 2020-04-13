package com.shoufeng.hystrix.learn.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class HystrixLearnProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixLearnProviderApplication.class, args);
    }
}
