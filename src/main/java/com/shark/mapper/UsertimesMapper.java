package com.shark.mapper;

import com.shark.entity.Usertimes;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertimesMapper {
    Usertimes SelectAll();
    Usertimes SelectById(int id);
}
