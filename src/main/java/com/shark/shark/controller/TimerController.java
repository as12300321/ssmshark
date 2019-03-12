package com.shark.shark.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TimerController {
    @RequestMapping("/timer")
    public String index(){
        System.out.println("test");
        return "timer";
    };
}
