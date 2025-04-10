package com.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/message")
    public String hello() {
        return "Hello Masdiii!";
    }
}
