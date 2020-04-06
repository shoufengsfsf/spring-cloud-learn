package com.shoufeng.eureka.client.provider.demo01.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/provider")
public class EurekaClientDemo01Controller {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/para")
    public String getRequest(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        String para = request.getParameter("para");
        return para + serverPort;
    }
}
