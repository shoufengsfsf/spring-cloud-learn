package com.shoufeng.hystrix.learn.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.shoufeng.hystrix.learn.consumer.service.HystrixLearnConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/hystrixlearnconsumer")
@DefaultProperties(defaultFallback = "myDefaultFallback")
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
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "30000")
            })
    public String test2() throws InterruptedException {
        return hystrixLearnConsumerService.fiveSecondTimeOutMethod();
    }

    @GetMapping("/test3/{num}")
    @HystrixCommand(
            commandProperties = {
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //是否开启断路器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //请求次数
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //时间窗口期
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后跳闸
            }
    )
    public String test3(@PathVariable(name = "num") Integer num) {
        return hystrixLearnConsumerService.calculate(num);
    }

    public String hystrixLearnConsumerDefaultFallback() {
        return "他妈的fallback了";
    }

    public String myDefaultFallback() {
        return "默认服务降级";
    }
}
