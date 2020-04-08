package com.shoufeng.zookeeper.client.comsumer.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/zk")
public class ZookeeperClientConsumerDemo01Controller {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://zookeeper-client-provider/zk/test", String.class);
    }
}
