package com.example.Shopping.service;

import com.example.Shopping.entity.User;
import com.example.Shopping.repository.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

//This class is for to give the service to User as getting his details from Repository
@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepositary repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= (User) repo.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),new ArrayList<>());
    }
}
