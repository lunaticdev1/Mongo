package com.mongo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String hello(){
        return "Hello World!!";
    }
    //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
}
