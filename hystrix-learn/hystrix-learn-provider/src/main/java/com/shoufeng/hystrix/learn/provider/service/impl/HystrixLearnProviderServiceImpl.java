package com.shoufeng.hystrix.learn.provider.service.impl;

import com.shoufeng.hystrix.learn.provider.service.HystrixLearnProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HystrixLearnProviderServiceImpl implements HystrixLearnProviderService {

    @Value("${server.port}")
    private String port;


    @Override
    public String normalMethod() {
        return port;
    }

    @Override
    public String fiveSecondTimeOutMethod() throws InterruptedException {
        Thread.sleep(5000L);
        return "timeout: " + port;
    }
}
