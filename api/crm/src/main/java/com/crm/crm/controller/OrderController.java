package com.crm.crm.controller;

import com.crm.crm.models.Order;
import com.crm.crm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping("/get/{id}")
    public Order getOrder(@PathVariable int id){
        return service.getOrder(id);
    }

    @PostMapping("/post")
    public Order addOrder(@RequestBody Order order){
        return service.addOrder(order);
    }
}
