package com.shoufeng.consul.client.consumer.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/consul")
public class ConsulClientConsumerDemo01Controller {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test() {

        return restTemplate.getForObject("http://consul-provider-demo/consul/test", String.class);
    }
}
