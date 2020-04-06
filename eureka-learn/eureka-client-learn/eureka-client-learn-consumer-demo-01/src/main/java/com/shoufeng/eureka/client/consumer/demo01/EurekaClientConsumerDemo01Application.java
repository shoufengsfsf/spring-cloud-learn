package com.shoufeng.eureka.client.consumer.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
//开启eureka client
@EnableEurekaClient
public class EurekaClientConsumerDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerDemo01Application.class, args);
    }
}
