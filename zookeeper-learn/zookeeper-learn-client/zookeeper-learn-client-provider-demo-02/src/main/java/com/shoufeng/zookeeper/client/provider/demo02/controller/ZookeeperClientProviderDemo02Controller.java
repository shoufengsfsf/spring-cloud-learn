package com.shoufeng.zookeeper.client.provider.demo02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/zk")
public class ZookeeperClientProviderDemo02Controller {
    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> map = new HashMap<>();
        map.put("serverPort", serverPort);
        int order = discoveryClient.getOrder();
        map.put("order", order);
        List<String> services = discoveryClient.getServices();
        map.put("services", services);
        for (String service : services) {
            List<ServiceInstance> serviceInstances = discoveryClient.getInstances(service);
            map.put("serviceInstances", serviceInstances);
        }

        return map;
    }
}
