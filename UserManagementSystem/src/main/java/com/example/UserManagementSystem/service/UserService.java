package com.example.UserManagementSystem.service;

import com.example.UserManagementSystem.model.User;
import com.example.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo ;



    public String addUser(User user) {
        List<User> originalList  = getAllUsers() ;
        originalList.add(user) ;
        return "New User Added Successfully" ;
    }

    public User getUser(Integer id) {
        List<User> originalList = getAllUsers() ;
        for(User data : originalList){
            if(data.getUserId()== id){
                return data ;
            }
        }
        return null ;
    }

    public List<User> getAllUsers() {
        return userRepo.getAllUser();
    }

  

    public String updateUserInfo(Integer id , User value) {
        List<User> originalList = getAllUsers();
        for (int i = 0; i < originalList.size(); i++) {
            User user = originalList.get(i);
            if (user.getUserId() == id) {
                originalList.set(i, value);
                return "Information updated Successfully" ;
            }
        }
        return "User Not Found" ;
    }

    public String deleteUser(Integer id) {
        List<User> originalList = getAllUsers() ;
        for(User data : originalList){
            if(data.getUserId()== id){
                originalList.remove(data);
                return "User Deleted Successfully " ;
            }
        }
        return "User Not Found" ;
    }
}
