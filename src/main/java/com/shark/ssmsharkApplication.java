package com.shark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shark.dao")
public class ssmsharkApplication {

    public static void main(String[] args) {
        SpringApplication.run(ssmsharkApplication.class,args);
    }
     
}
