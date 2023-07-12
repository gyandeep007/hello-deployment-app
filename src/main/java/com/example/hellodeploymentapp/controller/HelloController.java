package com.example.hellodeploymentapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String helloController(@RequestParam(required = false) String name){
        return (name == null || name.isEmpty())?"Welcome user":"welcome "+name;
    }
}
