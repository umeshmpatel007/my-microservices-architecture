package com.microservices.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    private String hello(){
        log.info("invoked hello rest controller");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(URI.create("http://department-service/departments/hello"), String.class);
        String response = responseEntity.getBody();
        return "hello from user-service " + response;
    }
}
