package com.example.UserManagementSystem.Configuration;

import com.example.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    List<User> getUserList(){
        return new ArrayList<>() ;
    }
}
