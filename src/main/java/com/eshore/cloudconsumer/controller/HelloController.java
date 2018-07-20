package com.eshore.cloudconsumer.controller;


import com.eshore.cloudconsumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloService.hello(name);
    }

}
