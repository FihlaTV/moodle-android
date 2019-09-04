package com.example.ks.moodle;

public abstract class FieldColumns {
    //主要为了注意每个字段之间的空格
    protected final static String SQL_CREATE = "create table if not exists";
    protected final static String INTEGER_INCREMENT = "integer auto_increment,";
    protected final static String TEXT = "TEXT,";
    //	protected final static String INTEGER = " integer,";
    protected final static String TIMESTAMP = "timestamp,";
    protected final static String TEXT_END= "TEXT";

    protected final static String ID = "id";

    public final static String TableName_Event = "tb_event";  //事件的id......必填
    public final static String Event_id = "event_id";  //事件的id......必填
    public final static String Event_name = "event_name";  //事件的名称

    public final static String Time_Stamp = "time_stamp";  //时间戳...必填
    public final static String Devices_model = "devices_model";  //设备的型号...必填
    public final static String System_Version = "system_version";  //系统的版本...必填
    public final static String Xuehao = "xuehao";
    public final static String name="name";


    /**
     * table tb_event
     * @return
     */
    public static String CreateEventTable(){
        /*return SQL_CREATE + TableName_Event + "(" +ID +INTEGER_INCREMENT
                + Event_id + TEXT
                + Event_name + TEXT
                + Time_Stamp + TIMESTAMP
                + Devices_model + TEXT
                + System_Version + TEXT
                + ")";
                */
        return "create table if not exists tb_event("+"id integer auto_increment,"+"event_id text,"+
                "name text,"+"xuehao text,"+"event_name text,"+"time_stamp text,"+"devices_model text,"+"system_version text)";



    }

}
