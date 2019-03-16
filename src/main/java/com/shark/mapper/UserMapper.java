package com.shark.mapper;
 
import com.shark.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
 

@Repository
public interface UserMapper {
 
    User Sel(int id);
}
