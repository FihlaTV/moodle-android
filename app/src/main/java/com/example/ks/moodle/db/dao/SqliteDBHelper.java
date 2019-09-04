package com.example.ks.moodle.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.ks.moodle.FieldColumns;
import com.example.ks.moodle.StatisticsHelper;

public class SqliteDBHelper extends SQLiteOpenHelper {
    //数据库名称
    private final static String DATABASE_NAME="statistic.db";
    //数据库版本
    private final static int DATABASE_VERSION=1;

    public SqliteDBHelper(Context context) {
        //创建数据库
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        if(StatisticsHelper.isDebug){
            Log.v("statistic","数据库初始化");
        }
    }

    //创建表
    @Override
    public void onCreate(SQLiteDatabase db) {
        if(StatisticsHelper.isDebug){
            Log.v("statistic","表创建了");
        }
        db.execSQL(FieldColumns.CreateEventTable());


    }

    //更新版本调用
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {


    }
}
