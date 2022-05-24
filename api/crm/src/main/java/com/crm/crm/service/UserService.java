package com.crm.crm.service;

import java.util.List;

import com.crm.crm.models.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.crm.repository.UserRepository;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    public User addUser(User user)
    {
        return repository.save(user);
    }

    public User getUser(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public List<User> getAllUsers()
    {
        return repository.findAll();
    }

    public int addNumbers(int a, int b)
    {
        return a+b;
    }
}
