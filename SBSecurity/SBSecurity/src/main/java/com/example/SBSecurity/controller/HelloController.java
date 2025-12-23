package com.example.SBSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Helloworld"+ request.getSession().getId();// to print session details
    }
    @GetMapping("/about")
    public String about(){
        return "Hi SpringBoot";
    }
}
