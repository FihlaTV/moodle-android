package com.example.ks.moodle.entity;

import java.util.List;

public class Chapter {
    private Integer id;
    private Integer lesssonId;
    private String sectionName;
    private String url;

    public Integer getLesssonId() {
        return lesssonId;
    }

    public void setLesssonId(Integer lesssonId) {
        this.lesssonId = lesssonId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
