package com.crm.crm.service;

import com.crm.crm.models.Person;
import com.crm.crm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person addPerson(Person person){
        return repository.save(person);
    }

    public Person getPerson(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Person> getPersons() {
        return repository.findAll();
    }
}
