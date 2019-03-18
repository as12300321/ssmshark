package com.shark.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.shark.entity.UsertimesPojo;

public interface UsertimesPojoDao {

    int insert(@Param("pojo") UsertimesPojo pojo);

    int insertList(@Param("pojos") List< UsertimesPojo> pojo);

    List<UsertimesPojo> select(@Param("pojo") UsertimesPojo pojo);

    int update(@Param("pojo") UsertimesPojo pojo);

    UsertimesPojo selectById(int id);
}
