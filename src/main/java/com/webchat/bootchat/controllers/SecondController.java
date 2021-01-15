package com.webchat.bootchat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @GetMapping("/second")
    public String saySecond() {
        return  "Hello from second controller! Waiting for the first one";
    }

    @GetMapping("/received")
    public String received() {
        return "received changes from task-1 branch";
    }
}