package com.example.parent.controller;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
