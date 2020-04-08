package com.shoufeng.consul.client.consumer.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientConsumerDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientConsumerDemo01Application.class, args);
    }
}
