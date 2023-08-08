package com.example.springbootdemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCotroller {

    @GetMapping("/hello")
//    @RequestMapping()
    public String hello(){
        return "hello world";
    }

    @RequestMapping(value = "/hello1",method = RequestMethod.POST)
    public String hello1(){
        System.out.println("nihao");
        return "ni hao /post";
    }
}
