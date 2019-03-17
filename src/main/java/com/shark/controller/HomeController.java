package com.shark.controller;

import com.shark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        String s = userService.Sel(id).toString();
        System.out.println(s);
        return s;
    }
}
