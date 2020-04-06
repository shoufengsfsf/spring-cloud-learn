package com.shoufeng.eureka.client.consumer.demo01.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author shoufeng
 */
@Configuration
public class MyConfig {
    @Bean
    //如果想通过eureka server上注册的服务名称调用provider集群，必须开启loadbalance注解
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
