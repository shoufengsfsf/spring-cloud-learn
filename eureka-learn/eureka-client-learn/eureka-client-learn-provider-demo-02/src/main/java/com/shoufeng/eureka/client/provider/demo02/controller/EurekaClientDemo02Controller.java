package com.shoufeng.eureka.client.provider.demo02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/provider")
public class EurekaClientDemo02Controller {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/para/{para}")
    public String getRequest(@PathVariable("para") String para, @RequestParam(value = "name") String name) {
        return para + serverPort + name;
    }
}