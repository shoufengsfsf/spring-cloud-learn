package com.shoufeng.feign.learn.comsumer.controller;

import com.shoufeng.feign.learn.comsumer.service.FeignConsumerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author shoufeng
 */
@RestController
@RequestMapping("/feignconsumer")
public class FeignConsumerController {

    @Resource
    private FeignConsumerService feignConsumerService;

    @GetMapping("/test/{para}")
    public String test(@PathVariable("para") String para, @RequestParam(value = "name") String name) {
        return feignConsumerService.getRequest(para, name);
    }
}
