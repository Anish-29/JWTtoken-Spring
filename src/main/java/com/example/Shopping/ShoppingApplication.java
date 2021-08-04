package com.example.Shopping;

import com.example.Shopping.entity.User;
import com.example.Shopping.repository.UserRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ShoppingApplication {
    @Autowired
	private UserRepositary repo;

    @PostConstruct
	public void initUsers(){
    	List<User> users= Stream.of(
    			new User(101,"Anish","pass","anishsridhar29@gmail.com")
		).collect(Collectors.toList());
    	repo.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
