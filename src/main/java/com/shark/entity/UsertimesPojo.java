package com.shark.entity;

public class UsertimesPojo {
    private int id;
    private String username;
    private String event_ts;
    private String insert_ts;
    private int daytimes;
    private String flag;

    @Override
    public String toString() {
        return "Usertimes{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", event_ts='" + event_ts + '\'' +
                ", insert_ts='" + insert_ts + '\'' +
                ", daytimes=" + daytimes +
                ", flag='" + flag + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEvent_ts() {
        return event_ts;
    }

    public void setEvent_ts(String event_ts) {
        this.event_ts = event_ts;
    }

    public String getInsert_ts() {
        return insert_ts;
    }

    public void setInsert_ts(String insert_ts) {
        this.insert_ts = insert_ts;
    }

    public int getDaytimes() {
        return daytimes;
    }

    public void setDaytimes(int daytimes) {
        this.daytimes = daytimes;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public UsertimesPojo(int id, String username, String event_ts, String insert_ts, int daytimes, String flag) {
        this.id = id;
        this.username = username;
        this.event_ts = event_ts;
        this.insert_ts = insert_ts;
        this.daytimes = daytimes;
        this.flag = flag;
    }
}
