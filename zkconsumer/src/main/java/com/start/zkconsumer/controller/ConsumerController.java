package com.start.zkconsumer.controller;

import com.start.zkprovider.service.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.dubbo.config.annotation.Reference;


@RestController
public class ConsumerController {

    @Reference
    private ProviderService providerService;

    @RequestMapping(path="hello",method = RequestMethod.GET)
    public String sayHello() {
        return providerService.sayHello();
    }
}