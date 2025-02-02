package com.example.api.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Slf4j
@Service
@AllArgsConstructor
public class ApiService {

    private final RestClient restClient;

    public String get() {
        log.info("Current thread: " + Thread.currentThread());
        return restClient
                .get()
                .uri("/hello")
                .retrieve()
                .body(String.class);
    }
}
