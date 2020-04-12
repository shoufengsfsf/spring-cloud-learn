package com.shoufeng.feign.learn.comsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shoufeng
 */
@Component
@FeignClient(name = "PROVIDER-DEMO-SERVICE")
public interface FeignConsumerService {

    @GetMapping("/provider/para/{para}")
    String getRequest(@PathVariable("para") String para, @RequestParam(value = "name") String name);

}
