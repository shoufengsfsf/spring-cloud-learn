package com.shoufeng.consul.client.provider.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientProviderDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientProviderDemo01Application.class, args);
    }
}
