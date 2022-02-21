package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.springcloud.dao")
public class paymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(paymentMain8001.class, args);
    }

}

