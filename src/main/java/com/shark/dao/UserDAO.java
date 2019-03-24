package com.shark.dao;

import com.shark.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserDAO {

    String TABLE_NAME = "user";
    String INSET_FIELDS = " username, password ";
    String SELECT_FIELDS = " id, username, password ";

    @Insert({"insert into ", TABLE_NAME, "(", INSET_FIELDS, ") values (#{userName},#{passWord})"})
    int addUser(User user);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where userName = #{userName}"})
    User selectUserByUserName(String userName);

    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id = #{id}"})
    User selectUserById(int id);
    @Update({"update ", TABLE_NAME, " set password = #{passWord} where username = #{userName}"})
    void updateUserPsdByName(User user);

}