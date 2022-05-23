package com.crm.crm.controller;

import com.crm.crm.models.Person;
import com.crm.crm.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/get/{id}")
    public Person getPerson(@PathVariable int id){
        return personService.getPerson(id);
    }

    @GetMapping("/get")
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @PostMapping("/post")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }
}
