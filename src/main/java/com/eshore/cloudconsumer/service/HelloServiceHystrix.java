package com.eshore.cloudconsumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloServiceHystrix implements HelloService {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name +", It's fused !";
    }
}
