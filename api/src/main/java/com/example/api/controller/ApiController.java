package com.example.api.controller;

import com.example.api.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ApiController {

    private final ApiService apiService;


    @GetMapping
    public String get() {
        return apiService.get();
    }
}
