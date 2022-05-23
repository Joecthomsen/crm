package com.crm.crm.controller;

import com.crm.crm.models.Customers;
import com.crm.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @GetMapping("/get/{id}")
    public Customers getCustomer(@PathVariable int id){
        return service.getCustomer(id);
    }

    @GetMapping("/get")
    public List<Customers> getCustomers(){
        return service.getCustomers();
    }

    @PostMapping("/post")
    public HttpEntity<Customers> addCustomer(@RequestBody Customers customers){
        Customers newCustomers = service.addCustomer(customers);
        return new ResponseEntity<>(newCustomers, HttpStatus.CREATED);
    }
}
