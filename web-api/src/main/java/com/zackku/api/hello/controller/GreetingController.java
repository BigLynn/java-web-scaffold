package com.zackku.api.hello.controller;

import com.zackku.service.helllo.domain.Greeting;
import com.zackku.service.helllo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zack
 * @date 2018/4/21
 */
@RestController
public class GreetingController {
    GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetService) {
        this.greetingService = greetService;
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = greetingService.createGreet(name);
        return greeting;
    }
}
