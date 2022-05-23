package com.crm.crm.service;

import com.crm.crm.models.Customers;
import com.crm.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public Customers getCustomer(int id){
        return repository.findById(id).orElse(null);
    }


    public List<Customers> getCustomers(){
        return repository.findAll();
    }

    public Customers addCustomer(Customers customers){
        return repository.save(customers);
    }
}
