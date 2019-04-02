package com.shark.dao;

import com.shark.entity.recordDay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface recordDayMapper {
    @Insert("insert into recordDay values(#{id},#{uuid},#{password},#{user_name},#{record_day},#{ufalg},#{update_ts},#{insert_ts})")
    int insert_recordDay(recordDay  recordday);
    @Select("select * from recordDay  where id=#{id}")
    List<recordDay> selectByid(int id);
    @Select("select * from recordDay ")
    List<recordDay> selectall();
}
