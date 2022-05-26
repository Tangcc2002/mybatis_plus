package com.mybatisplus.controller;

import com.mybatisplus.entities.User;
import com.mybatisplus.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService service;

    @GetMapping("/user")
    public List<User> getAllUser() {
        return service.list();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
}