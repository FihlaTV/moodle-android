package com.example.ks.moodle.entity;

import java.util.List;

public class Lesson {
    private Integer id;
    private Chapter chapterName;//章名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Chapter getChapterName() {
        return chapterName;
    }

    public void setChapterName(Chapter chapterName) {
        this.chapterName = chapterName;
    }
}
