package com.crm.crm.controller;

import com.crm.crm.models.Customer;
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
    public Customer getCustomer(@PathVariable int id){
        return service.getCustomer(id);
    }

    @GetMapping("/get")
    public List<Customer> getCustomers(){
        return service.getCustomers();
    }

    @PostMapping("/post")
    public HttpEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer newCustomer = service.addCustomer(customer);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
}
