package com.example.ks.moodle;

import android.content.Context;
import android.os.Build;

import com.example.ks.moodle.Bean.EventBean;
import com.example.ks.moodle.db.dao.EventDao;

import java.text.SimpleDateFormat;
import java.util.Map;

public class AddEventThread implements Runnable {
    private Context context;
    private String eventId;
    private String eventName;
    private String xuehao;
    private String name;
    private Map<String,Object> map;

    public AddEventThread(Context context, String eventId, String name,String xuehao,String eventName, Map<String, Object> map) {
        this.context=context;
        this.eventId=eventId;
        this.eventName=eventName;
        this.xuehao=xuehao;
        this.name=name;
        this.map=map;
    }

    @Override
    public void run() {
        EventBean event=new EventBean();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        event.setTime_stamp(simpleDateFormat.format(System.currentTimeMillis()));//时间戳
        event.setEvent_name(eventName);
        event.setXuehao(xuehao);
        event.setName(name);
        event.setDevices_model("型号:"+ Build.MODEL);//手机型号
        event.setSystem_version("系统版本:"+ Build.VERSION.RELEASE);//系统版本
        event.setEvent_id(eventId);
        EventDao.getInstance(context).insertData(event);

    }
}
