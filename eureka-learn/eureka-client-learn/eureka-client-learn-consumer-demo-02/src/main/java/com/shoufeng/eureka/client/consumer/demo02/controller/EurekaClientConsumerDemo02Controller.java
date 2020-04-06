package com.shoufeng.eureka.client.consumer.demo02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/consumer")
public class EurekaClientConsumerDemo02Controller {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/para")
    public String getRequest(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String para = request.getParameter("para");
        return restTemplate.getForEntity("http://127.0.0.1:8081/provider/para", String.class).getBody();
    }
}
