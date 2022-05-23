package com.crm.crm.controller;

import com.crm.crm.models.Item;
import com.crm.crm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping("/get/{id}")
    public Item getItem(@PathVariable int id){
        return service.getItem(id);
    }

    @PostMapping("/post")
    public Item addItem(@RequestBody Item item){
        return service.addItem(item);
    }
}
