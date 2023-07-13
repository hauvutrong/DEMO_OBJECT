package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("UserService2")
public class UserService2 implements UserServiceInterface{
    @Override
    public String getName(String name) {
        return "Namev2" + name;
    }
}
