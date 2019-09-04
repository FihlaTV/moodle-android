package com.example.ks.moodle.teacher_video.teacher_video12;

import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo12_1_1 extends TB {
    Toolbar toolbar;
    private TextView sun12_1_1Tv;
    private TextView sun12_1_2Tv;
    private TextView sun12_1_3Tv;
    private TextView sun12_1_4Tv;
    private TextView sun12_1_5Tv;
    private TextView sun12_1_6Tv;
    private TextView sun12_1_7Tv;
    private TextView sun12_1_8Tv;
    private TextView sun12_1_9Tv;
    private TextView sun12_1_10Tv;
    private TextView sun12_1_11Tv;
    private TextView sun12_1_12Tv;
    private TextView sun12_1_13Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher12_1_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun12_1_1Tv=(TextView)findViewById(R.id.sun12_1_1);
        sun12_1_2Tv=(TextView)findViewById(R.id.sun12_1_2);
        sun12_1_3Tv=(TextView)findViewById(R.id.sun12_1_3);
        sun12_1_4Tv=(TextView)findViewById(R.id.sun12_1_4);
        sun12_1_5Tv=(TextView)findViewById(R.id.sun12_1_5);
        sun12_1_6Tv=(TextView)findViewById(R.id.sun12_1_6);
        sun12_1_7Tv=(TextView)findViewById(R.id.sun12_1_7);
        sun12_1_8Tv=(TextView)findViewById(R.id.sun12_1_8);
        sun12_1_9Tv=(TextView)findViewById(R.id.sun12_1_9);
        sun12_1_10Tv=(TextView)findViewById(R.id.sun12_1_10);
        sun12_1_11Tv=(TextView)findViewById(R.id.sun12_1_11);
        sun12_1_12Tv=(TextView)findViewById(R.id.sun12_1_12);
        sun12_1_13Tv=(TextView)findViewById(R.id.sun12_1_13);


        sun12_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_01.mp4");
                startActivity(intent);
            }
        });

        sun12_1_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_02.mp4");
                startActivity(intent);
            }
        });

        sun12_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_03.mp4");
                startActivity(intent);
            }
        });

        sun12_1_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_04.mp4");
                startActivity(intent);
            }
        });

        sun12_1_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_05.mp4");
                startActivity(intent);
            }
        });

        sun12_1_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_06.mp4");
                startActivity(intent);
            }
        });
        sun12_1_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_07.mp4");
                startActivity(intent);
            }
        });
        sun12_1_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_08.mp4");
                startActivity(intent);
            }
        });
        sun12_1_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_09.mp4");
                startActivity(intent);
            }
        });
        sun12_1_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_10.mp4");
                startActivity(intent);
            }
        });
        sun12_1_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_11.mp4");
                startActivity(intent);
            }
        });
        sun12_1_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_12.mp4");
                startActivity(intent);
            }
        });
        sun12_1_13Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo12_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_06_13.mp4");
                startActivity(intent);
            }
        });
    }
}
