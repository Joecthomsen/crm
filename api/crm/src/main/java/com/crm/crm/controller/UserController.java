package com.crm.crm.controller;
import com.crm.crm.models.User;
import com.crm.crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/post")
    public User createUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable int id)
    {
        return userService.getUser(id);
    }

    @GetMapping("/get")
    public List<User> getUsers()
    {
        return userService.getAllUsers();
    }
}
