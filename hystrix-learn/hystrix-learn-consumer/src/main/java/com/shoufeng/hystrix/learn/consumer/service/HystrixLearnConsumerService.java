package com.shoufeng.hystrix.learn.consumer.service;


import com.shoufeng.hystrix.learn.consumer.service.impl.HystrixLearnConsumerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shoufeng
 */
@Component
//@FeignClient的fallback和@HystrixCommand的fallbackMethod都超时了，优先使用@HystrixCommand的fallbackMethod（就近原则）
@FeignClient(name = "HYSTRIX-LEARN-PROVIDER", fallback = HystrixLearnConsumerServiceImpl.class)
public interface HystrixLearnConsumerService {

    @GetMapping("/hystrixlearnprovider/normal")
    String normalMethod();

    @GetMapping("/hystrixlearnprovider/fiveSecondTimeOut")
    String fiveSecondTimeOutMethod() throws InterruptedException;
}
