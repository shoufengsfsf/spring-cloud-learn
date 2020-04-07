package com.shoufeng.eureka.client.consumer.demo01.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/consumer")
public class EurekaClientConsumerDemo01Controller {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/para")
    public String getRequest(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String para = request.getParameter("para");
        return restTemplate.getForEntity("http://PROVIDER-DEMO-SERVICE/provider/para", String.class).getBody();
    }

    @GetMapping("/discovery")
    public Map<String, Object> getDiscoveryInfo() {
        Map<String, Object> map = new HashMap<>();
        String description = discoveryClient.description();
        int order = discoveryClient.getOrder();
        List<String> services = discoveryClient.getServices();
        List<ServiceInstance> serviceInstances = discoveryClient.getInstances("provider-demo-service");
        map.put("description", description);
        map.put("order", order);
        map.put("services", services);
        map.put("serviceInstances", serviceInstances);


        return map;
    }
}
