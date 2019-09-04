package com.example.ks.moodle.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String student="create table student("
            + "xuehao text primary key,"
            +"password text,"
            +"name text,"
            +"description text)";
    public static final String teacher="create table teacher("
            + "id int primary key,"
            + "courseId int,"
            + "name text,"
            + "gender,"
            + "birth,"
            + "level,"
            + "email,"
            + "style,"
            + "link)";
    public static final String course="create table course("
            + "id integer primary key,"+ "name text,"+ "school text,"+ "reference)";
    public static final String behavior="create table behavior("
            + "id integer primary key,"+ "userId text,"+ "sectionId text,"+ "behave integer,"
            + "startTime text,"+ "endTime text,"+ "duration text,"+ "happenTime datetime)";
    public static final String section="create table section("
            + "id text primary key,"+ "lessonId integer,"+ "startTime text,"+ "endTime text"+
            "description text"+ "url text)";
    //章节
    public static final String lesson="create table lesson("
            +"id integer primary key,"+"chapterName text)";
    public static final String chapter="create table chapter("
            +"id integer primary key,"+"lessonId Integer,"+"sectionName text,"+"url text)";


    public static final String star_rating="create table starRating("
            +"id integer primary key,"+"userId text,"+"sectionId text,"+"grade real,"+"videoTime text,"+
            "happenTime datetime)";
    public static final String time_rank="create table timeRank("
            +"id integer primary key,"+"userId text,"+"updateId text,"+"name text,"+"totalTime text,"+
            "rank integer"+"description text)";
    public static final String time_rank_index="create table timeRankIndex("+"updateId text primary key,"+
            "updateTime datetime,"+"description text)";
    public static final String recommend_video="create table recommendVideo("
            +"id integer primary key,"+"userId text,"+"updateId text,"+"videoId text,"+"videoDescription text)";
    public static final String recommend_video_index="create table recommendVideoIndex("
            +"updateId text primary key,"+"updateTime datetime,"+"description text)";
    public static final String predict_score="create table predictScore("
            +"id integer primary key,"+"userId text,"+"score integer,"+"happenTime datetime,"+"clickTime datetime)";
    public static final String predict_score_index="create table predictScoreIndex("
            +"id integer primary key,"+"predictTime datetime)";





    private Context mcontext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mcontext=context;
    }

    @Override
    //执行数据库的操作
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(student);
//        db.execSQL(teacher);
//        db.execSQL(behavior);
//        db.execSQL(lesson);
//        db.execSQL(chapter);
        Toast.makeText(mcontext,"create succeeded",Toast.LENGTH_SHORT).show();

    }



    @Override
    //更新数据库
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists student");
        onCreate(db);




    }
}
