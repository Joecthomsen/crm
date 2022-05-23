package com.crm.crm.service;

import com.crm.crm.models.Customer;
import com.crm.crm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    public Customer getCustomer(int id){
        return repository.getOne(id);
    }

    public List<Customer> getCustomers(){
        return repository.findAll();
    }

    public Customer addCustomer(Customer customer){
        return repository.save(customer);
    }
}
