package com.shark.service;

import com.shark.dao.UserMapper;
import com.shark.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public List<User> SelectAll(){

        return userMapper.SelectAll();
    }
}
