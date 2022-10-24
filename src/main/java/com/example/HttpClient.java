package com.example;


import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class HttpClient {

    private final RestTemplate restTemplate;

    public HttpClient(RestTemplateBuilder templateBuilder) {
        this.restTemplate = createRestTemplate(templateBuilder);
    }

    private RestTemplate createRestTemplate(RestTemplateBuilder templateBuilder) {
        RestTemplate restTemplate = templateBuilder.build();
        return restTemplate;
    }

    public void httpReq() {
        // do http request by restTemplate
    }
}
