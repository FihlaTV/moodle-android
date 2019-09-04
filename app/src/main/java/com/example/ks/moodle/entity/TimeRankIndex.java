package com.example.ks.moodle.entity;

import java.util.Date;
//排名计算程序的执行记录表
//每周期执行一次就记录一条
public class TimeRankIndex {
    private String updateId;
    private Date updateTime;
    private String description;

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
