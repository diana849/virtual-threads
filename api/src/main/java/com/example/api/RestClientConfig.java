package com.example.api;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Value("${client.url}")
    private String CLIENT_URL;

    @Bean
    public RestClient restClient() {
        return RestClient.builder()
                .baseUrl(CLIENT_URL)
                .build();
    }
}
