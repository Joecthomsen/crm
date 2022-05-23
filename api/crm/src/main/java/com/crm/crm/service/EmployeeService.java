package com.crm.crm.service;

import com.crm.crm.models.Employees;
import com.crm.crm.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private PersonRepository repository;

    public Employees addPerson(Employees employees){
        return repository.save(employees);
    }

    public Employees getPerson(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Employees> getPersons() {
        return repository.findAll();
    }
}
