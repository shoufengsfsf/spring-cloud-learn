package com.shoufeng.hystrix.learn.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shoufeng.hystrix.learn.provider.service.HystrixLearnProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/hystrixlearnprovider")
public class HystrixLearnProviderController {

    @Autowired
    private HystrixLearnProviderService hystrixLearnProviderService;

    @GetMapping("/normal")
    public String normalMethod() {
        return hystrixLearnProviderService.normalMethod();
    }

    @GetMapping("/fiveSecondTimeOut")
    public String fiveSecondTimeOutMethod() throws InterruptedException {
        return hystrixLearnProviderService.fiveSecondTimeOutMethod();
    }

    @GetMapping("/calculate/{num}")
    public String calculate(@PathVariable(name = "num") Integer num) {
        return hystrixLearnProviderService.calculate(num);
    }
}
