package com.webchat.bootchat.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    public String sayFirst() {
        return "Hello from first controller";
    }
}
