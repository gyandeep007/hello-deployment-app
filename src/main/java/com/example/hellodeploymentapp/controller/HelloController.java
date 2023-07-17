package com.example.hellodeploymentapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String helloController(@RequestParam(required = false) String name){
        return (name == null || name.isEmpty())?"Welcome dummy user":"welcome "+name;
    }

    @GetMapping(value = "/calculate")
    public int calculateController(@RequestParam(required = false) String firstNumber,
                                      @RequestParam(required = false) String secondNumber){
        System.out.println("getting request for adding two number");
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        return first+second;
    }
}

