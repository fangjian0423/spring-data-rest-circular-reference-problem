package com.example;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestBeanWithRestTemplateBuilder {

    private final RestTemplateBuilder templateBuilder;

    public TestBeanWithRestTemplateBuilder(RestTemplateBuilder templateBuilder) {
        this.templateBuilder = templateBuilder;
    }

    @Bean
    public HttpClient httpClient() {
        return new HttpClient(templateBuilder);
    }


    public RestTemplateBuilder getTemplateBuilder() {
        return templateBuilder;
    }

}
