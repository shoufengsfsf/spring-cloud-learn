package com.shoufeng.zookeeper.client.comsumer.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZookeeperClientConsumerDemo02Application {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperClientConsumerDemo02Application.class, args);
    }
}
