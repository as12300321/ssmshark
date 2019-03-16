package com.shark.controller;


import com.shark.entity.User;
import com.shark.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboots")
public class TestBootController {
    @RequestMapping("a")
    public User getUsers() {
        User user = new User();
        user.setUseName("aaaaa");
        String aa=user.toString();
        return user;
    }
}