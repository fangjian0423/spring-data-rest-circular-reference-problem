package com.example;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Component
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

    private final RestTemplateBuilder restTemplateBuilder;

    public CustomWebMvcConfigurer(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        // adding OAuth2AuthorizedClientArgumentResolver, it depends on global RestTemplateBuilder
    }
}
