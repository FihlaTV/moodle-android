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

public class TeacherVideo9_4_1 extends TB {
    Toolbar toolbar;
    private TextView sun9_4_1_1Tv;
    private TextView sun9_4_1_2Tv;
    private TextView sun9_4_1_3Tv;
    private TextView sun9_4_1_4Tv;
    private TextView sun9_4_1_5Tv;
    private TextView sun9_4_1_6Tv;
    private TextView sun9_4_1_7Tv;
    private TextView sun9_4_1_8Tv;
    private TextView sun9_4_1_9Tv;
    private TextView sun9_4_1_10Tv;
    private TextView sun9_4_21_1Tv;
    private TextView sun9_4_21_2Tv;
    private TextView sun9_4_21_3Tv;
    private TextView sun9_4_21_4Tv;
    private TextView sun9_4_21_5Tv;
    private TextView sun9_4_21_6Tv;
    private TextView sun9_4_22_1Tv;
    private TextView sun9_4_22_2Tv;
    private TextView sun9_4_22_3Tv;
    private TextView sun9_4_22_4Tv;
    private TextView sun9_4_22_5Tv;
    private TextView sun9_4_22_6Tv;
    private TextView sun9_4_22_7Tv;
    private TextView sun9_4_22_8Tv;
    private TextView sun9_4_22_9Tv;
    private TextView sun9_4_22_10Tv;
    private TextView sun9_4_22_11Tv;
    private TextView sun9_4_22_12Tv;
    private TextView sun9_4_22_13Tv;
    private TextView sun9_4_22_14Tv;
    private TextView sun9_4_22_15Tv;
    private TextView sun9_4_22_16Tv;
    private TextView sun9_4_51_1Tv;
    private TextView sun9_4_51_2Tv;
    private TextView sun9_4_51_3Tv;
    private TextView sun9_4_51_4Tv;
    private TextView sun9_4_51_5Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_4_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun9_4_1_1Tv = (TextView)findViewById(R.id.sun9_4_1_1);
        sun9_4_1_2Tv = (TextView)findViewById(R.id.sun9_4_1_2);
        sun9_4_1_3Tv = (TextView)findViewById(R.id.sun9_4_1_3);
        sun9_4_1_4Tv = (TextView)findViewById(R.id.sun9_4_1_4);
        sun9_4_1_5Tv = (TextView)findViewById(R.id.sun9_4_1_5);
        sun9_4_1_6Tv = (TextView)findViewById(R.id.sun9_4_1_6);
        sun9_4_1_7Tv = (TextView)findViewById(R.id.sun9_4_1_7);
        sun9_4_1_8Tv = (TextView)findViewById(R.id.sun9_4_1_8);
        sun9_4_1_9Tv = (TextView)findViewById(R.id.sun9_4_1_9);
        sun9_4_1_10Tv = (TextView)findViewById(R.id.sun9_4_1_10);
        sun9_4_21_1Tv = (TextView)findViewById(R.id.sun9_4_21_1);
        sun9_4_21_2Tv = (TextView)findViewById(R.id.sun9_4_21_2);
        sun9_4_21_3Tv = (TextView)findViewById(R.id.sun9_4_21_3);
        sun9_4_21_4Tv = (TextView)findViewById(R.id.sun9_4_21_4);
        sun9_4_21_5Tv = (TextView)findViewById(R.id.sun9_4_21_5);
        sun9_4_21_6Tv = (TextView)findViewById(R.id.sun9_4_21_6);
        sun9_4_22_1Tv = (TextView)findViewById(R.id.sun9_4_22_1);
        sun9_4_22_2Tv = (TextView)findViewById(R.id.sun9_4_22_2);
        sun9_4_22_3Tv = (TextView)findViewById(R.id.sun9_4_22_3);
        sun9_4_22_4Tv = (TextView)findViewById(R.id.sun9_4_22_4);
        sun9_4_22_5Tv = (TextView)findViewById(R.id.sun9_4_22_5);
        sun9_4_22_6Tv = (TextView)findViewById(R.id.sun9_4_22_6);
        sun9_4_22_7Tv = (TextView)findViewById(R.id.sun9_4_22_7);
        sun9_4_22_8Tv = (TextView)findViewById(R.id.sun9_4_22_8);
        sun9_4_22_9Tv = (TextView)findViewById(R.id.sun9_4_22_9);
        sun9_4_22_10Tv = (TextView)findViewById(R.id.sun9_4_22_10);
        sun9_4_22_11Tv = (TextView)findViewById(R.id.sun9_4_22_11);
        sun9_4_22_12Tv = (TextView)findViewById(R.id.sun9_4_22_12);
        sun9_4_22_13Tv = (TextView)findViewById(R.id.sun9_4_22_13);
        sun9_4_22_14Tv = (TextView)findViewById(R.id.sun9_4_22_14);
        sun9_4_22_15Tv = (TextView)findViewById(R.id.sun9_4_22_15);
        sun9_4_22_16Tv = (TextView)findViewById(R.id.sun9_4_22_16);
        sun9_4_51_1Tv = (TextView)findViewById(R.id.sun9_4_51_1);
        sun9_4_51_2Tv = (TextView)findViewById(R.id.sun9_4_51_2);
        sun9_4_51_3Tv = (TextView)findViewById(R.id.sun9_4_51_3);
        sun9_4_51_4Tv = (TextView)findViewById(R.id.sun9_4_51_4);
        sun9_4_51_5Tv = (TextView)findViewById(R.id.sun9_4_51_5);

        sun9_4_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_01.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_02.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_03.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_04.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_05.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_06.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_07.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_08.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_09.mp4");
                startActivity(intent);
            }
        });
        sun9_4_1_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_02_10.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_01.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_02.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_03.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_04.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_05.mp4");
                startActivity(intent);
            }
        });
        sun9_4_21_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_03_06.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_01.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_02.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_03.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_04.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_05.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_06.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_07.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_08.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_09.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_10.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_11.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_12.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_13Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_13.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_14Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_14.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_15Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_15.mp4");
                startActivity(intent);
            }
        });
        sun9_4_22_16Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_04_16.mp4");
                startActivity(intent);
            }
        });
        sun9_4_51_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_01.mp4");
                startActivity(intent);
            }
        });
        sun9_4_51_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_02.mp4");
                startActivity(intent);
            }
        });
        sun9_4_51_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_03.mp4");
                startActivity(intent);
            }
        });
        sun9_4_51_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_03.mp4");
                startActivity(intent);
            }
        });
        sun9_4_51_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_4_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_05.mp4");
                startActivity(intent);
            }
        });
    }
}
