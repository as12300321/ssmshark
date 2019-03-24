package com.shark.dao;
 

import com.shark.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    @Select(" SELECT * FROM users  where id= #{id} ")
    User Sel(int id);

    @Select(" SELECT * FROM users ")
    List<User> SelectAll();
}
