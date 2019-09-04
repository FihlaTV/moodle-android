package com.example.ks.moodle.teacher_video.teacher_video9;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;

import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo9_1_1 extends TB {
    Toolbar toolbar;
    private TextView sun9_1_1Tv;
    private TextView sun9_1_2Tv;
    private TextView sun9_1_3Tv;
    private TextView sun9_1_4Tv;
    private TextView sun9_1_5Tv;
    private TextView sun9_1_9Tv;
    private TextView sun9_1_10Tv;
    private TextView sun9_1_11Tv;
    private TextView sun9_1_12Tv;
    private TextView sun9_1_13Tv;
    private TextView sun9_1_14Tv;




    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_1_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun9_1_1Tv = (TextView) findViewById(R.id.sun9_1_1);
        sun9_1_2Tv = (TextView) findViewById(R.id.sun9_1_2);
        sun9_1_3Tv = (TextView) findViewById(R.id.sun9_1_3);
        sun9_1_4Tv = (TextView) findViewById(R.id.sun9_1_4);
        sun9_1_5Tv = (TextView) findViewById(R.id.sun9_1_6);
        sun9_1_9Tv = (TextView) findViewById(R.id.sun9_1_9);
        sun9_1_10Tv = (TextView) findViewById(R.id.sun9_1_10);
        sun9_1_11Tv = (TextView) findViewById(R.id.sun9_1_11);
        sun9_1_12Tv = (TextView) findViewById(R.id.sun9_1_12);
        sun9_1_13Tv = (TextView) findViewById(R.id.sun9_1_13);
        sun9_1_14Tv = (TextView) findViewById(R.id.sun9_1_14);



        sun9_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_01.mp4");
                startActivity(intent);
            }
        });

        sun9_1_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_02.mp4");
                startActivity(intent);
            }
        });
        sun9_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_03.mp4");
                startActivity(intent);
            }
        });
        sun9_1_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_04.mp4");
                startActivity(intent);
            }
        });
        sun9_1_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_05.mp4");
                startActivity(intent);
            }
        });
        sun9_1_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_09.mp4");
                startActivity(intent);
            }
        });
        sun9_1_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_10.mp4");
                startActivity(intent);
            }
        });
        sun9_1_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_11.mp4");
                startActivity(intent);
            }
        });
        sun9_1_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_12.mp4");
                startActivity(intent);
            }
        });
        sun9_1_13Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_13.mp4");
                startActivity(intent);
            }
        });
        sun9_1_14Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_14.mp4");
                startActivity(intent);
            }
        });
    }
}
