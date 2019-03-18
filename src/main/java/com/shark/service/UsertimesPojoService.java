package com.shark.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.shark.entity.UsertimesPojo;
import com.shark.dao.UsertimesPojoDao;

@Service
public class UsertimesPojoService {

    @Resource
    private UsertimesPojoDao usertimesPojoDao;

    public int insert(UsertimesPojo pojo){
        return usertimesPojoDao.insert(pojo);
    }

    public int insertList(List< UsertimesPojo> pojos){
        return usertimesPojoDao.insertList(pojos);
    }

    public List<UsertimesPojo> select(UsertimesPojo pojo){
        return usertimesPojoDao.select(pojo);
    }
    public UsertimesPojo SelectById(int id){
        UsertimesPojo usertimesPojo= usertimesPojoDao.selectById(id);
     return usertimesPojo;
    }
    public int update(UsertimesPojo pojo){
        return usertimesPojoDao.update(pojo);
    }

}
