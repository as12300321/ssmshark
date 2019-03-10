package com.shark.shark.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 

@Controller
public class HelloController {
 
    @RequestMapping("hello")
    public String hello(String name, Model model) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        model.addAttribute("name", name);
        model.addAttribute("strList", list);
        model.addAttribute("show", false);
        return "hello";
    }
}
