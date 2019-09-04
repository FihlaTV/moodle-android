package com.example.ks.moodle.teacher_video.teacher_video11;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo11_6_1 extends TB {
    Toolbar toolbar;
    private TextView sun11_6_1Tv;
    private TextView sun11_6_2Tv;
    private TextView sun11_6_3Tv;
    private TextView sun11_6_4Tv;
    private TextView sun11_6_5Tv;
    private TextView sun11_6_6Tv;
    private TextView sun11_6_7Tv;
    private TextView sun11_6_8Tv;
    private TextView sun11_6_9Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_6_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun11_6_1Tv=(TextView)findViewById(R.id.sun11_6_1);
        sun11_6_2Tv=(TextView)findViewById(R.id.sun11_6_2);
        sun11_6_3Tv=(TextView)findViewById(R.id.sun11_6_3);
        sun11_6_4Tv=(TextView)findViewById(R.id.sun11_6_4);
        sun11_6_5Tv=(TextView)findViewById(R.id.sun11_6_5);
        sun11_6_6Tv=(TextView)findViewById(R.id.sun11_6_6);
        sun11_6_7Tv=(TextView)findViewById(R.id.sun11_6_7);
        sun11_6_8Tv=(TextView)findViewById(R.id.sun11_6_8);
        sun11_6_9Tv=(TextView)findViewById(R.id.sun11_6_9);


        sun11_6_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_14.mp4");
                startActivity(intent);
            }
        });

        sun11_6_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_15.mp4");
                startActivity(intent);
            }
        });

        sun11_6_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_01.mp4");
                startActivity(intent);
            }
        });

        sun11_6_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_02.mp4");
                startActivity(intent);
            }
        });

        sun11_6_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_03.mp4");
                startActivity(intent);
            }
        });

        sun11_6_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_04.mp4");
                startActivity(intent);
            }
        });
        sun11_6_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_05.mp4");
                startActivity(intent);
            }
        });
        sun11_6_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_05_06.mp4");
                startActivity(intent);
            }
        });
        sun11_6_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_07.mp4");
                startActivity(intent);
            }
        });

    }
}