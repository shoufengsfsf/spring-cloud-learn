package com.shoufeng.hystrix.learn.consumer.service.impl;

import com.shoufeng.hystrix.learn.consumer.service.HystrixLearnConsumerService;
import org.springframework.stereotype.Component;

@Component
public class HystrixLearnConsumerServiceImpl implements HystrixLearnConsumerService {
    @Override
    public String normalMethod() {
        return "normalMethod他妈的fallbak了";
    }

    @Override
    public String fiveSecondTimeOutMethod() throws InterruptedException {
        return "fiveSecondTimeOutMethod他妈的fallback了";
    }

    @Override
    public String calculate(Integer num) {
        return "calculate他妈的fallback了";
    }
}
