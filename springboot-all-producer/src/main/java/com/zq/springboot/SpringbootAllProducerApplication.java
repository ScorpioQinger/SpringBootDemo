package com.zq.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootAllProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAllProducerApplication.class, args);
    }
}
