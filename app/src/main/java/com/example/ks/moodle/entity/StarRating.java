package com.example.ks.moodle.entity;

import java.util.Date;

public class StarRating {
    private Integer id;
    private String userId;
    private String sectionId;
    private Float grade;
    private String videoTime;
    private Date happenTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happeTime) {
        this.happenTime = happeTime;
    }
}
