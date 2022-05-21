package com.crm.crm.controller;

import com.crm.crm.models.User;
import com.crm.crm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{email}")
    public User getUser(@PathVariable String email)
    {
        return userService.getUser(email);
    }

}
