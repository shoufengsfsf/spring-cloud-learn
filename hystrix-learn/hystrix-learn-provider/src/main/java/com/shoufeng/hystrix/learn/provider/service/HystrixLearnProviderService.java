package com.shoufeng.hystrix.learn.provider.service;


/**
 * @author shoufeng
 */
public interface HystrixLearnProviderService {

    String normalMethod();

    String fiveSecondTimeOutMethod() throws InterruptedException;

    String calculate(Integer num);
}
