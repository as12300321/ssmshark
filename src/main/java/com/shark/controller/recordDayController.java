package com.shark.controller;

import com.shark.service.recordDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.rmi.CORBA.Util;

@RestController
@RequestMapping("/record")
public class recordDayController {
    /**
     *
     */
    @Autowired
    recordDayService recordDayService;

    @RequestMapping("/ins")
    public void setRecordDayService(String ts) {
        System.out.println(ts);
        long l = Long.parseLong(ts);
        this.recordDayService.insert_recordDay(l);
    }
}


