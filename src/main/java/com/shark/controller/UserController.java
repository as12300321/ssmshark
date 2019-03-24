package com.shark.controller;
 

import com.shark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

 
@RestController
@RequestMapping("/testBoot")
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){

        String s = userService.Sel(id).toString();
        System.out.println(s);
        return s;
    }
    @RequestMapping("/all")
    public String GetUserAll(){
        String all = userService.SelectAll().toString();
        System.out.println(all);
        
        return all;
    }
}
