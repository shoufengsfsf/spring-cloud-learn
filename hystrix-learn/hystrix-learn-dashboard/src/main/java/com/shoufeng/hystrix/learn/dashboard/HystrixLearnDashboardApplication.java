package com.shoufeng.hystrix.learn.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author shoufeng
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixLearnDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixLearnDashboardApplication.class, args);
    }
}
