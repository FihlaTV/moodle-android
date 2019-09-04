package com.example.ks.moodle.entity;

import java.util.Date;

public class PredictScore {
    private Integer id;
    private String userid;//哪位学生
    private Integer score;//预测分数
    private Date happentime; //准确时间
    private Date clicktime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Date getHappentime() {
        return happentime;
    }

    public void setHappentime(Date happentime) {
        this.happentime = happentime;
    }

    public Date getClicktime() {
        return clicktime;
    }

    public void setClicktime(Date clicktime) {
        this.clicktime = clicktime;
    }
}
