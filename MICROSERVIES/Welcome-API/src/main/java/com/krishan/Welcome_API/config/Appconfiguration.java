package com.krishan.Welcome_API.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Appconfiguration {
    @Bean
    public RestTemplate getInstance(){
        return new RestTemplate();
    }
}
