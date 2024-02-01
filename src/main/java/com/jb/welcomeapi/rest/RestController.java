package com.jb.welcomeapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    Environment env;
    @GetMapping("/welcome")
    public String getWelcomeMsg(){
        return "Welcome to JB IT (" +env.getProperty("server.port")+")";
    }
}
