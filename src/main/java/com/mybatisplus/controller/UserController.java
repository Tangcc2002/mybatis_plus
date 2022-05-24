package com.mybatisplus.controller;

import com.mybatisplus.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private UserService service;

    @GetMapping("/user")
    private Long getAllUser() {
        return service.count();
    }
}