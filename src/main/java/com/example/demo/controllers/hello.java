package com.example.demo.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class hello {
    @GetMapping("/")
    public String sayHello(){
        System.out.println("Reuqest is made at the end point.");
        return "Hello World!";
    }
    @GetMapping("/another")
    public String sayAnotherHello(){
        return "Another hello.";
    }
}
