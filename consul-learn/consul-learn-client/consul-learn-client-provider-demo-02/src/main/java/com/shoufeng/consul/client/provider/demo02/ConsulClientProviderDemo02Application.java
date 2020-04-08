package com.shoufeng.consul.client.provider.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientProviderDemo02Application {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientProviderDemo02Application.class, args);
    }
}
