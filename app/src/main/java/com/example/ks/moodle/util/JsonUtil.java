package com.example.ks.moodle.util;

import com.google.gson.Gson;

public class JsonUtil {
    public static JsonUtil instance=null;
    public static JsonUtil getInstance(){
        if(instance==null){
            instance=new JsonUtil();
        }
        return instance;
    }
    public String beanToJson(Object bean){
        Gson gson=new Gson();
        return gson.toJson(bean);

    }
}
