package com.crm.crm.service;

import com.crm.crm.models.Order;
import com.crm.crm.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public Order getOrder(int id){
        return repository.getOne(id);
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public Order addOrder(Order order){
        return repository.save(order);
    }

}
