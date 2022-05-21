package com.crm.crm.service;

import java.util.List;

import com.crm.crm.models.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.crm.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User addUser(User user)
    {
        return repository.save(user);
    }

    public User getUser(String email)
    {
        return repository.findById(email).orElse(null);
    }

    public List<User> getAllUsers()
    {
        return repository.findAll();
    }
}
