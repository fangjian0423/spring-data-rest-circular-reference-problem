package com.example;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    private final HttpClient httpClient;

    public CustomWebMvcConfigurer(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

}
