package com.example.ks.moodle.teacher_video.teacher_video1;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo1_4_3 extends TB {
    Toolbar toolbar;
    private TextView sun1_4_1Tv;
    private TextView sun1_4_2Tv;
    private TextView sun1_4_3Tv;
    private TextView sun1_4_4Tv;
    private TextView sun1_4_5Tv;
    private TextView sun1_4_6Tv;
    private TextView sun1_4_7Tv;
    private TextView sun1_4_8Tv;
    private TextView sun1_4_9Tv;
    private TextView sun1_4_10Tv;
    private TextView sun1_4_11Tv;
    private TextView sun1_4_12Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_4_3);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun1_4_1Tv=(TextView)findViewById(R.id.sun1_4_1);
        sun1_4_2Tv=(TextView)findViewById(R.id.sun1_4_2);
        sun1_4_3Tv=(TextView)findViewById(R.id.sun1_4_3);
        sun1_4_4Tv=(TextView)findViewById(R.id.sun1_4_4);
        sun1_4_5Tv=(TextView)findViewById(R.id.sun1_4_5);
        sun1_4_6Tv=(TextView)findViewById(R.id.sun1_4_6);
        sun1_4_7Tv=(TextView)findViewById(R.id.sun1_4_7);
        sun1_4_8Tv=(TextView)findViewById(R.id.sun1_4_8);
        sun1_4_9Tv=(TextView)findViewById(R.id.sun1_4_9);
        sun1_4_10Tv=(TextView)findViewById(R.id.sun1_4_10);
        sun1_4_11Tv=(TextView)findViewById(R.id.sun1_4_11);
        sun1_4_12Tv=(TextView)findViewById(R.id.sun1_4_12);
        sun1_4_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_04.mp4");
                startActivity(intent);
            }
        });
        sun1_4_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_05.mp4");
                startActivity(intent);

            }
        });
        sun1_4_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_06.mp4");
                startActivity(intent);
            }
        });
        sun1_4_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_07.mp4");
                startActivity(intent);
            }
        });
        sun1_4_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_04_05.mp4");
                startActivity(intent);
            }
        });
        sun1_4_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_08.mp4");
                startActivity(intent);
            }
        });
        sun1_4_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_09.mp4");
                startActivity(intent);
            }
        });
        sun1_4_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_10.mp4");
                startActivity(intent);
            }
        });
        sun1_4_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_03_11.mp4");
                startActivity(intent);
            }
        });
        sun1_4_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_04_03.mp4");
                startActivity(intent);
            }
        });
        sun1_4_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_04_04.mp4");
                startActivity(intent);
            }
        });
        sun1_4_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_02_04_02.mp4");
                startActivity(intent);
            }
        });

    }
}
