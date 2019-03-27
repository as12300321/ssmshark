package com.shark.service;

import com.shark.dao.User_vipMapper;
import com.shark.entity.user_vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_vipService {
    @Autowired
    User_vipMapper user_vipMapper;

    public boolean insertUser_vip(user_vip uservip) {
        int raw = user_vipMapper.insertUser_vip(uservip);
            return raw>0;
    }
}
