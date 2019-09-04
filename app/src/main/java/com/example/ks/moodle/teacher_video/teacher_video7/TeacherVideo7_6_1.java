package com.example.ks.moodle.teacher_video.teacher_video7;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo7_6_1 extends TB {
    Toolbar toolbar;
    private TextView sun7_6_1Tv;
    private TextView sun7_6_2Tv;
    private TextView sun7_6_3Tv;
    private TextView sun7_6_4Tv;
    private TextView sun7_6_5Tv;
    private TextView sun7_6_6Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_6_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun7_6_1Tv=(TextView)findViewById(R.id.sun7_6_1);
        sun7_6_2Tv=(TextView)findViewById(R.id.sun7_6_2);
        sun7_6_3Tv=(TextView)findViewById(R.id.sun7_6_3);
        sun7_6_4Tv=(TextView)findViewById(R.id.sun7_6_4);
        sun7_6_5Tv=(TextView)findViewById(R.id.sun7_6_5);
        sun7_6_6Tv=(TextView)findViewById(R.id.sun7_6_6);

        sun7_6_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_01_13.mp4");
                startActivity(intent);
            }
        });

        sun7_6_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_02_01.mp4");
                startActivity(intent);
            }
        });

        sun7_6_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_02_02.mp4");
                startActivity(intent);
            }
        });

        sun7_6_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_02_03.mp4");
                startActivity(intent);
            }
        });

        sun7_6_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_02_04.mp4");
                startActivity(intent);
            }
        });
        sun7_6_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_6_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_09_02_05.mp4");
                startActivity(intent);
            }
        });
    }
}
