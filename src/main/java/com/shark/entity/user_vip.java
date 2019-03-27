package com.shark.entity;

import java.util.Date;

public class user_vip {
    private int id;
    private  String  user_name;
    private  String  password;
    private  String  phone;
    private  String  gender;
    private  String  target;
    private  String  action;
    private  String  other;
    private String email;
    private Date insert_ts;
    private Date update_ts;
    private String head_protrait;

    @Override
    public String toString() {
        return "user_vip{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", target='" + target + '\'' +
                ", action='" + action + '\'' +
                ", other='" + other + '\'' +
                ", email='" + email + '\'' +
                ", insert_ts=" + insert_ts +
                ", update_ts=" + update_ts +
                ", head_protrait=" + head_protrait +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getInsert_ts() {
        return insert_ts;
    }

    public void setInsert_ts(Date insert_ts) {
        this.insert_ts = insert_ts;
    }

    public Date getUpdate_ts() {
        return update_ts;
    }

    public void setUpdate_ts(Date update_ts) {
        this.update_ts = update_ts;
    }

    public String getHead_protrait() {
        return head_protrait;
    }

    public void setHead_protrait(String head_protrait) {
        this.head_protrait = head_protrait;
    }

    public user_vip() {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.target = target;
        this.action = action;
        this.other = other;
        this.email = email;
        this.insert_ts = insert_ts;
        this.update_ts = update_ts;
        this.head_protrait = head_protrait;
    }
}

