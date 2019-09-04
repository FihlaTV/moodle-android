package com.example.ks.moodle.entity;

import java.util.Date;

public class Behavior {
    private Integer id;
    private String userId;//学生的学号
    private String sectionId;//某节视频的id
    private Integer behave;//一共有17种行为
    private String startTime;
    private String endTime;
    private String duration;//从打开页面到行为发生持续的时间
    private Date happenTime;//行为发生的标准时间
}
