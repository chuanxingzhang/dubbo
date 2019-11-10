package com.start.zkprovider.service.impl;

import com.start.zkprovider.service.ProviderService;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;

@Service(interfaceClass = ProviderService.class)
@Component
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello() {
        return "hello!!!";
    }
}
