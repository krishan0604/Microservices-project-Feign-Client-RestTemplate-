package com.krishan.Welcome_API.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class WelcomeController {
    @Autowired
    private GreetFiegnClient greetFiegnClient;
/*
    @GetMapping("/welcome")
    public String welcome(){

        String welcomeMsg ="welcome to microservics with second api..";
        String greet = restTemplate.getForObject("http://localhost:9090/greet", String.class);
        return greet+welcomeMsg;
        
 */
         @GetMapping("/welcome")
    public String welcome(){

        String welcomeMsg ="welcome to microservics with second api..🙏";
             String greet = greetFiegnClient.invokeGreetApi();
             return greet+welcomeMsg;
    } 

}
