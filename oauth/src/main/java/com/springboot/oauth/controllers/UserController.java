package com.springboot.oauth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
@RestController
public class UserController {

    @GetMapping("/user")
    public void user(Principal principal){
        System.out.println(principal.getName());
    }
    @GetMapping("/redirect")
    public void redirect(Principal principal){
        System.out.println("Principal from redirect");

    }

}
