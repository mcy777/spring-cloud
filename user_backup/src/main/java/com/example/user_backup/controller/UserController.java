package com.example.user_backup.controller;

import com.example.user_backup.domain.User_a;
import com.example.user_backup.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/users")
    public List<User_a> users() {
        System.err.println("users2");
        return userMapper.findAll();
    }
}
