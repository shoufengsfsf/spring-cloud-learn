package com.shoufeng.eureka.client.provider.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/provider")
public class EurekaClientDemo01Controller {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/para/{para}")
    public String getRequest(@PathVariable("para") String para, @RequestParam(value = "name") String name) {
        return para + serverPort + name;
    }
}
