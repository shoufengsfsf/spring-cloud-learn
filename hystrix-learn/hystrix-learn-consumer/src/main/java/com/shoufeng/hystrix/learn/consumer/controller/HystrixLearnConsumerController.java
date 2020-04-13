package com.shoufeng.hystrix.learn.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.shoufeng.hystrix.learn.consumer.service.HystrixLearnConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/hystrixlearnconsumer")
public class HystrixLearnConsumerController {
    @Resource
    private HystrixLearnConsumerService hystrixLearnConsumerService;

    @GetMapping("/test1")
    public String test1() {
        return hystrixLearnConsumerService.normalMethod();
    }

    @GetMapping("/test2")
    @HystrixCommand(
            fallbackMethod = "hystrixLearnConsumerDefaultFallback",
            commandProperties = {
                    //这里的超时会调用fallbackMethod
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
            })
    public String test2() throws InterruptedException {
        return hystrixLearnConsumerService.fiveSecondTimeOutMethod();
    }

    public String hystrixLearnConsumerDefaultFallback() {
        return "他妈的fallback了";
    }
}
