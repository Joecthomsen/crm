package com.crm.crm.service;

import com.crm.crm.models.Item;
import com.crm.crm.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    public Item getItem(int id){
        return repository.getOne(id);
    }

    public Item addItem(Item item){
        return repository.save(item);
    }
}
