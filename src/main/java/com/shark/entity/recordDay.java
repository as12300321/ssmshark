package com.shark.entity;

import java.util.Date;

/**
 * Created by  Sazz
 **/
public class recordDay {
    private int id;
    private String uuid;
    private  String user_name;
    private  int record_day;
    private  String ufalg;
    private Date update_ts;
    private Date insert_ts;

    @Override
    public String toString() {
        return "recordDay{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", user_name='" + user_name + '\'' +
                ", record_day=" + record_day +
                ", ufalg='" + ufalg + '\'' +
                ", update_ts=" + update_ts +
                ", insert_ts=" + insert_ts +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getRecord_day() {
        return record_day;
    }

    public void setRecord_day(int record_day) {
        this.record_day = record_day;
    }

    public String getUfalg() {
        return ufalg;
    }

    public void setUfalg(String ufalg) {
        this.ufalg = ufalg;
    }

    public Date getUpdate_ts() {
        return update_ts;
    }

    public void setUpdate_ts(Date update_ts) {
        this.update_ts = update_ts;
    }

    public Date getInsert_ts() {
        return insert_ts;
    }

    public void setInsert_ts(Date insert_ts) {
        this.insert_ts = insert_ts;
    }

    public recordDay(int id, String uuid, String user_name, int record_day, String ufalg, Date update_ts, Date insert_ts) {
        this.id = id;
        this.uuid = uuid;
        this.user_name = user_name;
        this.record_day = record_day;
        this.ufalg = ufalg;
        this.update_ts = update_ts;
        this.insert_ts = insert_ts;
    }
}
