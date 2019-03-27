package com.shark.dao;

import com.shark.entity.User;
import com.shark.entity.user_vip;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface User_vipMapper {
    @Select(" SELECT * FROM user_vip  where id= #{id} ")
    User Sel(int id);

    @Select(" SELECT * FROM user_vip ")
    List<user_vip> SelectAll();
     @Insert("insert into user_vip values(#{id},#{user_name},#{password},#{phone},#{gender},#{target},#{action},#{insert_ts},#{other},#{email},#{update_ts},#{head_protrait})")
    int insertUser_vip(user_vip  user_vip);
 

}
