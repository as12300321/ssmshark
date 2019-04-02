package com.shark.service;

import com.shark.dao.recordDayMapper;
import com.shark.entity.recordDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Service
public class recordDayService {

    @Autowired
    recordDayMapper  recorddayMapper;

    public int insert_recordDay(Long ts) {
        recordDay recordDay = new recordDay();
        Date date = new Date();
        recordDay.setInsert_ts(date);
        recordDay.setRecord_day(1);
        recordDay.setUfalg("N");
        recordDay.setUpdate_ts(date);
        recordDay.setUser_name("zhangsan");
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        recordDay.setUuid(uuid);
        return recorddayMapper.insert_recordDay(recordDay);
    }
    public List<recordDay>  SelectAll(){
        return recorddayMapper.selectall();
    }
}
