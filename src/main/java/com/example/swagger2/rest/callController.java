package com.example.swagger2.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api")
@RestController
public class callController {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
}
