package com.webchat.bootchat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdController {
    @GetMapping("/third")
    public String sayThird() {
        return "Waiting for changes from task-2";
    }
}
