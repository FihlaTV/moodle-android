package com.example.ks.moodle.db.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.ks.moodle.Bean.EventBean;
import com.example.ks.moodle.FieldColumns;
import com.example.ks.moodle.StatisticsHelper;

import java.util.ArrayList;
import java.util.List;

public class EventDao {
    private Context context;
    private static EventDao instances;

    private EventDao(Context context){
        this.context=context;
    }

    public static EventDao getInstance(Context context){
        if(null==instances){
            synchronized (EventDao.class){
                if(null==instances){
                    instances=new EventDao(context);
                }
            }
        }
        return instances;
    }

    /**
     * 查询统计数据表
     * @param num 需要查询的条数
     * @return
     */
    public List<EventBean> queryEventList(int num){
        String sql="select * from "+ FieldColumns.TableName_Event
                +"where"+FieldColumns.Time_Stamp+"<? limit "+num+"offset 0";
        SQLiteDatabase database=DBManager.getInstance(context).getDatabase();
        Cursor cursor=null;
        EventBean sData=null;
        List<EventBean> list=null;
        try{
            cursor=database.rawQuery(sql,new String[]{StatisticsHelper.indextime+""});
            if(cursor!=null&&cursor.getCount()>0){
                list=new ArrayList<EventBean>();
                while(cursor.moveToNext()){
                    sData=new EventBean();
                    sData.setId(cursor.getInt(cursor.getColumnIndex("id")));
                    sData.setEvent_id(cursor.getString(cursor.getColumnIndex(FieldColumns.Event_id)));
                    sData.setEvent_name(cursor.getString(cursor.getColumnIndex(FieldColumns.Event_name)));
                    sData.setXuehao(cursor.getString(cursor.getColumnIndex(FieldColumns.Xuehao)));
                    sData.setXuehao(cursor.getString(cursor.getColumnIndex(FieldColumns.name)));
                    sData.setTime_stamp(cursor.getString(cursor.getColumnIndex(FieldColumns.Time_Stamp)));
                    sData.setDevices_model(cursor.getString(cursor.getColumnIndex(FieldColumns.Devices_model)));
                    sData.setSystem_version(cursor.getString(cursor.getColumnIndex(FieldColumns.System_Version)));
                    list.add(sData);
                }
            }
        }catch (Exception e){
            if(StatisticsHelper.isDebug){
                Log.v("statistic","EventDao.."+"查询数据异常"+e.toString());
            }
            sData=null;
            list=null;
            e.printStackTrace();
        }finally {
            if(cursor!=null){
                cursor.close();
            }
        }
        return list;
    }

    /**
     * 根据num的值删除数据
     * @param num
     */
    public void deleteData(int num){
        String sql = "delete from " + FieldColumns.TableName_Event + " where "+ FieldColumns.Time_Stamp +" in"
                +  "(select "+ FieldColumns.Time_Stamp +" from "+ FieldColumns.TableName_Event
                +" where "+ FieldColumns.Time_Stamp + "<"+ StatisticsHelper.indextime +" limit "+ num +" offset 0)";
        SQLiteDatabase database=DBManager.getInstance(context).getDatabase();
        database.execSQL(sql);

    }

    /**
     * 插入一条数据
     * @param eventBean
     */
    public void insertData(EventBean eventBean){
        if(eventBean==null){
            return;
        }
        SQLiteDatabase database=DBManager.getInstance(context).getDatabase();
        ContentValues values=new ContentValues();
        values.put(FieldColumns.Event_id,eventBean.getEvent_id());
        values.put(FieldColumns.Event_name,eventBean.getEvent_name());
        values.put(FieldColumns.name,eventBean.getName());
        values.put(FieldColumns.Xuehao,eventBean.getXuehao());
        values.put(FieldColumns.Time_Stamp,eventBean.getTime_stamp());
        values.put(FieldColumns.Devices_model,eventBean.getDevices_model());
        values.put(FieldColumns.System_Version,eventBean.getSystem_version());
        database.insert(FieldColumns.TableName_Event,null,values);

    }


}
