package com.example.UserManagementSystem.controller;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService ;
    @PostMapping("User")
    String addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("User/{Id}")
    User getUser(@PathVariable Integer Id){
        return userService.getUser(Id) ;
    }
    @GetMapping("Users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("User/{Id}")
    String updateUserInfo(@PathVariable Integer Id , @RequestBody User user){
        return userService.updateUserInfo(Id , user);
    }

    @DeleteMapping("User/{Id}")
    String deleteUser(@PathVariable Integer Id){
        return userService.deleteUser(Id);

    }

}
