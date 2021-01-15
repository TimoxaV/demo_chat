package com.webchat.bootchat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/first")
    public String sayFirst() {
        return "Hello from first controller";
    }

    @GetMapping("/first-wait-third")
    public String waitThird() {
        return "Waiting for the third controller";
    }
}
