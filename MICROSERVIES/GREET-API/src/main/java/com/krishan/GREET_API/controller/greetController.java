package com.krishan.GREET_API.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class greetController {
    private static final Logger logger= LoggerFactory.getLogger(greetController.class);
    @GetMapping("/greet")
    public String greetMsg(){
        logger.info("inside greet msd metode..");
        return "hello welcome to microservies...";
    }
}
