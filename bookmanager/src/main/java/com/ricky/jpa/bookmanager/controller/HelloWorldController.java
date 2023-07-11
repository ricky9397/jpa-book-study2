package com.ricky.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello-world")
    public String helloWorldController() {
        return "hello-world";
    }


    @PostMapping("/login")
    public String test() {
        System.out.println("test sibalruma");
        return "";
    }


}