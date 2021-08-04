package com.example.Shopping.repository;

import com.example.Shopping.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


//Which helps to get data from repositary
public abstract class UserRepositary implements JpaRepository<User, Integer> {

    @Autowired
    private User user;

    public User findByUserName(String username){
        return null;
    }
}
