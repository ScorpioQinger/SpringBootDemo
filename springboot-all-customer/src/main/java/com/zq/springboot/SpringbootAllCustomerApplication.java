package com.zq.springboot;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//让dubbo配置可用
public class SpringbootAllCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAllCustomerApplication.class, args);
    }
}
