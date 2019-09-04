package com.example.ks.moodle.teacher_video.teacher_video5;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo5_2_1 extends TB {
    Toolbar toolbar;
    private TextView sun5_2_1Tv;
    private TextView sun5_2_2Tv;
    private TextView sun5_2_3Tv;
    private TextView sun5_2_4Tv;
    private TextView sun5_2_5Tv;
    private TextView sun5_2_6Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher5_2_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun5_2_1Tv=(TextView)findViewById(R.id.sun5_2_1);
        sun5_2_2Tv=(TextView)findViewById(R.id.sun5_2_2);
        sun5_2_3Tv=(TextView)findViewById(R.id.sun5_2_3);
        sun5_2_4Tv=(TextView)findViewById(R.id.sun5_2_4);
        sun5_2_5Tv=(TextView)findViewById(R.id.sun5_2_5);
        sun5_2_6Tv=(TextView)findViewById(R.id.sun5_2_6);

        sun5_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_11.mp4");
                startActivity(intent);
            }
        });

        sun5_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_12.mp4");
                startActivity(intent);
            }
        });

        sun5_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_13.mp4");
                startActivity(intent);
            }
        });

        sun5_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_02_01.mp4");
                startActivity(intent);
            }
        });

        sun5_2_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_02_02.mp4");
                startActivity(intent);
            }
        });

        sun5_2_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_2_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_02_03.mp4");
                startActivity(intent);
            }
        });
    }
}
