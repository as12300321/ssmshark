package com.shark.dao;

import com.shark.entity.User;
import com.shark.entity.user_vip;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface User_vipMapper {
    @Select(" SELECT * FROM user_vip  where id= #{id} ")
    User Sel(int id);

    @Select("select * from user_vip where user_name=#{user_name}")
    int  selectByUsername(String user_name);
    @Select(" SELECT * FROM user_vip ")
    List<user_vip> SelectAll();
    @Update("update   user_vip  set user_name=#{user_name} where id=#{id} ")
    int update(int id,user_vip  user_vip );
    @Insert("insert into user_vip values(#{id},#{user_name},#{password},#{phone},#{gender},#{target},#{action},#{insert_ts},#{other},#{email},#{update_ts},#{head_protrait})")

    @Delete("delect * from user_vip where id =#{id} ")
    int  DelectById(int id);

     @Insert("insert into user_vip values(#{id},#{user_name},#{password},#{phone},#{gender},#{target},#{action},#{insert_ts},#{other},#{email},#{update_ts},#{head_protrait})")
    int insertUser_vip(user_vip  user_vip);
}
