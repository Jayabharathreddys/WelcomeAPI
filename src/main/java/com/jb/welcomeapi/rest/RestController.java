package com.jb.welcomeapi;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome to JB IT";
    }
}
