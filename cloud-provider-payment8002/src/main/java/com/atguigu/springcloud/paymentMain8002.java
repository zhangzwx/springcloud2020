package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class paymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8002.class, args);
    }

}

