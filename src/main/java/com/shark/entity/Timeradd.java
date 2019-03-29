package com.shark.entity;

import java.util.Date;

/**
 * Created by  Sazz
 **/
public class Timeradd {
    private  int id;
    private Date add_data;
    private  long  add_times;
    private  int  num_times;
    private String flag;
    private String comment;
    private String user;

    @Override
    public String toString() {
        return "Timeradd{" +
                "id=" + id +
                ", add_data=" + add_data +
                ", add_times=" + add_times +
                ", num_times=" + num_times +
                ", flag='" + flag + '\'' +
                ", comment='" + comment + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAdd_data() {
        return add_data;
    }

    public void setAdd_data(Date add_data) {
        this.add_data = add_data;
    }

    public long getAdd_times() {
        return add_times;
    }

    public void setAdd_times(long add_times) {
        this.add_times = add_times;
    }

    public int getNum_times() {
        return num_times;
    }

    public void setNum_times(int num_times) {
        this.num_times = num_times;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timeradd(int id, Date add_data, long add_times, int num_times, String flag, String comment, String user) {
        this.id = id;
        this.add_data = add_data;
        this.add_times = add_times;
        this.num_times = num_times;
        this.flag = flag;
        this.comment = comment;
        this.user = user;
    }
}
