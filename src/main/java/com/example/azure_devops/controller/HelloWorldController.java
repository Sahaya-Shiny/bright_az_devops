package com.example.azure_devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World...";
    }

    @GetMapping(value = "/{userName}")
    public String helloUser(@PathVariable String userName) {
        return String.format("Hello %s", userName);
    }
}
