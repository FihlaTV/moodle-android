package com.example.ks.moodle.entity;

import java.util.Date;

//每次执行推荐程序的程序执行记录表
public class RecommendVideoIndex {
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
