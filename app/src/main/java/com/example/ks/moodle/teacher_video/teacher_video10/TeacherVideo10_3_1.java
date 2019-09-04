package com.example.ks.moodle.teacher_video.teacher_video10;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo10_3_1 extends TB {
    Toolbar toolbar;
    private TextView sun10_3_1_4Tv;
    private TextView sun10_3_1_5Tv;
    private TextView sun10_3_1_6Tv;
    private TextView sun10_3_1_7Tv;
    private TextView sun10_3_1_8Tv;
    private TextView sun10_3_1_9Tv;
    private TextView sun10_3_1_10Tv;
    private TextView sun10_3_1_11Tv;
    private TextView sun10_3_1_12Tv;
    private TextView sun10_3_1_13Tv;
    private TextView sun10_3_1_14Tv;
    private TextView sun10_3_1_15Tv;
    private TextView sun10_3_1_16Tv;
    private TextView sun10_3_1_17Tv;
    private TextView sun10_3_1_18Tv;
    private TextView sun10_3_1_19Tv;
    private TextView sun10_3_1_20Tv;
    private TextView sun10_3_1_21Tv;
    private TextView sun10_3_2_1Tv;
    private TextView sun10_3_2_2Tv;
    private TextView sun10_3_2_3Tv;
    private TextView sun10_3_2_4Tv;
    private TextView sun10_3_2_5Tv;
    private TextView sun10_3_2_6Tv;
    private TextView sun10_3_2_7Tv;
    private TextView sun10_3_2_8Tv;
    private TextView sun10_3_2_9Tv;
    private TextView sun10_3_2_10Tv;
    private TextView sun10_3_2_11Tv;
    private TextView sun10_3_2_12Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher10_3_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun10_3_1_4Tv = (TextView)findViewById(R.id.sun10_3_1_4);
        sun10_3_1_5Tv = (TextView)findViewById(R.id.sun10_3_1_5);
        sun10_3_1_6Tv = (TextView)findViewById(R.id.sun10_3_1_6);
        sun10_3_1_7Tv = (TextView)findViewById(R.id.sun10_3_1_7);
        sun10_3_1_8Tv = (TextView)findViewById(R.id.sun10_3_1_8);
        sun10_3_1_9Tv = (TextView)findViewById(R.id.sun10_3_1_9);
        sun10_3_1_10Tv = (TextView)findViewById(R.id.sun10_3_1_10);
        sun10_3_1_11Tv = (TextView)findViewById(R.id.sun10_3_1_11);
        sun10_3_1_12Tv = (TextView)findViewById(R.id.sun10_3_1_12);
        sun10_3_1_13Tv = (TextView)findViewById(R.id.sun10_3_1_13);
        sun10_3_1_14Tv = (TextView)findViewById(R.id.sun10_3_1_14);
        sun10_3_1_15Tv = (TextView)findViewById(R.id.sun10_3_1_15);
        sun10_3_1_16Tv = (TextView)findViewById(R.id.sun10_3_1_16);
        sun10_3_1_17Tv = (TextView)findViewById(R.id.sun10_3_1_17);
        sun10_3_1_18Tv = (TextView)findViewById(R.id.sun10_3_1_18);
        sun10_3_1_19Tv = (TextView)findViewById(R.id.sun10_3_1_19);
        sun10_3_1_20Tv = (TextView)findViewById(R.id.sun10_3_1_20);
        sun10_3_1_21Tv = (TextView)findViewById(R.id.sun10_3_1_21);
        sun10_3_2_1Tv = (TextView)findViewById(R.id.sun10_3_2_1);
        sun10_3_2_2Tv = (TextView)findViewById(R.id.sun10_3_2_2);
        sun10_3_2_3Tv = (TextView)findViewById(R.id.sun10_3_2_3);
        sun10_3_2_4Tv = (TextView)findViewById(R.id.sun10_3_2_4);
        sun10_3_2_5Tv = (TextView)findViewById(R.id.sun10_3_2_5);
        sun10_3_2_6Tv = (TextView)findViewById(R.id.sun10_3_2_6);
        sun10_3_2_7Tv = (TextView)findViewById(R.id.sun10_3_2_7);
        sun10_3_2_8Tv = (TextView)findViewById(R.id.sun10_3_2_8);
        sun10_3_2_9Tv = (TextView)findViewById(R.id.sun10_3_2_9);
        sun10_3_2_10Tv = (TextView)findViewById(R.id.sun10_3_2_10);
        sun10_3_2_11Tv = (TextView)findViewById(R.id.sun10_3_2_11);
        sun10_3_2_12Tv = (TextView)findViewById(R.id.sun10_3_2_12);


        sun10_3_1_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_04.mp4");
                startActivity(intent);
            }
         });
        sun10_3_1_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_04.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_06.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_07.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_08.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_09.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_10.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_11.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_12.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_13Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_13.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_14Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_14.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_15Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_15.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_16Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_16.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_17Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_17.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_18Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_18.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_19Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_19.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_20Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_20.mp4");
                startActivity(intent);
            }
        });
        sun10_3_1_21Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_21.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_01.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_02.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_03.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_04.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_05.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_06.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_07.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_08.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_09.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_10.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_11.mp4");
                startActivity(intent);
            }
        });
        sun10_3_2_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_3_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_02_12.mp4");
                startActivity(intent);
            }
        });

    }




}
