package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/hello")
    public String get() throws InterruptedException {
        Thread.sleep(3000);
        return "hello";
    }
}
