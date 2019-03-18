package com.shark.controller;

import com.shark.entity.UsertimesPojo;
import com.shark.service.UsertimesPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Usertimescontroller {

    @Autowired
   private UsertimesPojoService usertimesPojoService;
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
       UsertimesPojo s = usertimesPojoService.SelectById(id);
        System.out.println(s.toString());
        return s.toString();
    }
}
