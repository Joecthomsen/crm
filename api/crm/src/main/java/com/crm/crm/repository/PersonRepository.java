package com.crm.crm.repository;

import com.crm.crm.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Employees, Integer> {
}
