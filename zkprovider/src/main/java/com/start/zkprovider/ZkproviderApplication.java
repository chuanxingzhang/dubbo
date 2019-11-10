package com.start.zkprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class ZkproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkproviderApplication.class, args);
    }

}
