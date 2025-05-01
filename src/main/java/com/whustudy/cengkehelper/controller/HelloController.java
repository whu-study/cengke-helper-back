package com.whustudy.cengkehelper.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/echo")
    public String hello() {
        // 1
        return "Hello, World!";
    }
}
