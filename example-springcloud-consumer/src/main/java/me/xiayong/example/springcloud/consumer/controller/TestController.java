package me.xiayong.example.springcloud.consumer.controller;

import me.xiayong.example.springcloud.api.ExampleFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YongXia.
 * @since 1.0
 */
@RestController
public class TestController {
    @Autowired
    private ExampleFacade exampleFacade;


    @RequestMapping("test")
    public String test() {
        return exampleFacade.now();
    }
}
