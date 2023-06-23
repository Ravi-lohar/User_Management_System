package com.example.UserManagementSystem.repository;

import com.example.UserManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    private List<User> userList;

    public List<User> getAllUser() {
        return userList ;
    }
}
