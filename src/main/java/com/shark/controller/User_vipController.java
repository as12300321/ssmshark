package com.shark.controller;

import com.shark.entity.user_vip;
import com.shark.service.User_vipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/testBoots")
public class User_vipController {
    @Autowired
    User_vipService user_vipService;

    @RequestMapping("/insert")
    public String GetUserAll(){
        user_vip userVip = new user_vip();
        userVip.setAction("y");
        userVip.setId(1);
        userVip.setGender("男");
        Date date = new Date();
        java.sql.Date data1=new java.sql.Date(date.getTime());
        userVip.setInsert_ts(data1);
        boolean falg = user_vipService.insertUser_vip(userVip);


            System.out.println(falg);

            System.out.println("xxxxxxxxxxxxxxxxxxxxxxx");


        return String.valueOf(falg);
    }
}
