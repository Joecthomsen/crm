package com.crm.crm.repository;
import com.crm.crm.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer>
{
    //User getUserByEmail(String email);
}