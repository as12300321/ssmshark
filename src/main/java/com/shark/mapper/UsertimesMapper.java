package com.shark.mapper;

import com.shark.entity.UsertimesPojo;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertimesMapper {
    UsertimesPojo SelectAll();
    UsertimesPojo SelectById(int id);
}
