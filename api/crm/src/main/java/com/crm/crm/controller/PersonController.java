package com.crm.crm.controller;

import com.crm.crm.models.Employees;
import com.crm.crm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get/{id}")
    public Employees getPerson(@PathVariable int id){
        return employeeService.getPerson(id);
    }

    @GetMapping("/get")
    public List<Employees> getPersons(){
        return employeeService.getPersons();
    }

    @PostMapping("/post")
    public Employees addPerson(@RequestBody Employees employees){
        return employeeService.addPerson(employees);
    }
}
