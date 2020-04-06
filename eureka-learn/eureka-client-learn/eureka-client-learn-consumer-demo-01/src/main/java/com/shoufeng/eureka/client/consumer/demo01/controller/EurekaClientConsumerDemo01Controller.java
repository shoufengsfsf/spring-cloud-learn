package com.shoufeng.eureka.client.consumer.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
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
public class EurekaClientConsumerDemo01Controller {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/para")
    public String getRequest(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String para = request.getParameter("para");
        return restTemplate.getForEntity("http://PROVIDER-DEMO-SERVICE/provider/para", String.class).getBody();
    }
}
