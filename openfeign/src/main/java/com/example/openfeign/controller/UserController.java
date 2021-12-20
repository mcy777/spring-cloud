package com.example.openfeign.controller;

import com.example.openfeign.Service.UserService;
import com.example.openfeign.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/openfeign")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> users() {
        System.out.println(1);
        return userService.users();
    }
}
