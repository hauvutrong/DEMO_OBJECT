package com.example.demo.controller;


import com.example.demo.service.UserService2;
import com.example.demo.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
            @Qualifier("UserService2")
    UserServiceInterface userServiceInterface;

    @RequestMapping(value = "/getName",method = RequestMethod.GET)
    public String getName(){
        String fileName = userServiceInterface.getName("Hauvt");
        return fileName;
    }
}
