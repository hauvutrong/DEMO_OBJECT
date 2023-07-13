package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service("UserService1")
public class UserService implements UserServiceInterface{
    @Override
    public String getName(String name) {
        return name;
    }
}
