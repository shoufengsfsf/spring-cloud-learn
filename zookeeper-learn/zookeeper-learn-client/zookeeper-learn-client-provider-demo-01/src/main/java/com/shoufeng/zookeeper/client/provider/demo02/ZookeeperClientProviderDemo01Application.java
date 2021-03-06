package com.shoufeng.zookeeper.client.provider.demo02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class  ZookeeperClientProviderDemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientProviderDemo01Application.class, args);
    }
}
