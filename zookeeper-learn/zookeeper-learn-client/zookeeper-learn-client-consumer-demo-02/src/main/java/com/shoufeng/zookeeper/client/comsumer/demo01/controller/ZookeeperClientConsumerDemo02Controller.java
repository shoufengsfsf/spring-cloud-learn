package com.shoufeng.zookeeper.client.comsumer.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/zk")
public class ZookeeperClientConsumerDemo02Controller {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/test")
    public String test() {
        return serverPort + UUID.randomUUID().toString();
    }
}
