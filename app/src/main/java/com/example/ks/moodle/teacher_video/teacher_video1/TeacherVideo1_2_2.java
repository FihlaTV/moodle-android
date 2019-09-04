package com.example.ks.moodle.teacher_video.teacher_video1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo1_2_2 extends TB {
    Toolbar toolbar;
    private TextView mei1_2_1Tv;
    private TextView mei1_2_2Tv;
    private TextView mei1_2_3Tv;
    private TextView mei1_2_4Tv;
    private TextView mei1_2_5Tv;
    private TextView mei1_2_6Tv;
    private TextView mei1_2_7Tv;
    private TextView mei1_2_8Tv;
    private TextView mei1_2_9Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_2_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mei1_2_1Tv=(TextView)findViewById(R.id.mei1_2_1);
        mei1_2_2Tv=(TextView)findViewById(R.id.mei1_2_2);
        mei1_2_3Tv=(TextView)findViewById(R.id.mei1_2_3);
        mei1_2_4Tv=(TextView)findViewById(R.id.mei1_2_4);
        mei1_2_5Tv=(TextView)findViewById(R.id.mei1_2_5);
        mei1_2_6Tv=(TextView)findViewById(R.id.mei1_2_6);
        mei1_2_7Tv=(TextView)findViewById(R.id.mei1_2_7);
        mei1_2_8Tv=(TextView)findViewById(R.id.mei1_2_8);
        mei1_2_9Tv=(TextView)findViewById(R.id.mei1_2_9);
        mei1_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_05.mp4");
                startActivity(intent);
            }
        });
        mei1_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_06.mp4");
                startActivity(intent);

            }
        });
        mei1_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_07.mp4");
                startActivity(intent);
            }
        });
        mei1_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_12.mp4");
                startActivity(intent);
            }
        });
        mei1_2_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_13.mp4");
                startActivity(intent);
            }
        });
        mei1_2_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_15.mp4");
                startActivity(intent);
            }
        });
        mei1_2_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_16.mp4");
                startActivity(intent);
            }
        });
        mei1_2_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_11.mp4");
                startActivity(intent);
            }
        });
        mei1_2_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_14.mp4");
                startActivity(intent);
            }
        });

    }
}
