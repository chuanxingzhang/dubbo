package com.zcx.service.service.impl;

import com.zcx.service.service.DemoService;

import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.Resource;

/**
 * Default {@link DemoService}
 *
 * @since 2.6.5
 */
@Service
public class DefaultService implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
