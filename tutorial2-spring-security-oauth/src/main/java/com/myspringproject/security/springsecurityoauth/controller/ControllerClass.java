package com.myspringproject.security.springsecurityoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {
    @GetMapping("/demo")
    public String demo(){
       return "welcome to oauth demo";
    }
}
