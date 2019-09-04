package com.example.ks.moodle.entity;

import java.util.Date;

public class PredictScoreIndex {
    private Integer id;
    private Date predictTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(Date predictTime) {
        this.predictTime = predictTime;
    }
}
