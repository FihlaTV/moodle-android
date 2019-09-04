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

public class TeacherVideo11_5_1 extends TB {
    Toolbar toolbar;
    private TextView sun11_5_1Tv;
    private TextView sun11_5_2Tv;
    private TextView sun11_5_3Tv;
    private TextView sun11_5_4Tv;
    private TextView sun11_5_5Tv;
    private TextView sun11_5_6Tv;
    private TextView sun11_5_7Tv;
    private TextView sun11_5_8Tv;
    private TextView sun11_5_9Tv;
    private TextView sun11_5_10Tv;
    private TextView sun11_5_11Tv;
    private TextView sun11_5_12Tv;
    private TextView sun11_5_13Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_5_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun11_5_1Tv=(TextView)findViewById(R.id.sun11_5_1);
        sun11_5_2Tv=(TextView)findViewById(R.id.sun11_5_2);
        sun11_5_3Tv=(TextView)findViewById(R.id.sun11_5_3);
        sun11_5_4Tv=(TextView)findViewById(R.id.sun11_5_4);
        sun11_5_5Tv=(TextView)findViewById(R.id.sun11_5_5);
        sun11_5_6Tv=(TextView)findViewById(R.id.sun11_5_6);
        sun11_5_7Tv=(TextView)findViewById(R.id.sun11_5_7);
        sun11_5_8Tv=(TextView)findViewById(R.id.sun11_5_8);
        sun11_5_9Tv=(TextView)findViewById(R.id.sun11_5_9);
        sun11_5_10Tv=(TextView)findViewById(R.id.sun11_5_10);
        sun11_5_11Tv=(TextView)findViewById(R.id.sun11_5_11);
        sun11_5_12Tv=(TextView)findViewById(R.id.sun11_5_12);
        sun11_5_13Tv=(TextView)findViewById(R.id.sun11_5_13);


        sun11_5_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_01.mp4");
                startActivity(intent);
            }
        });

        sun11_5_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_02.mp4");
                startActivity(intent);
            }
        });

        sun11_5_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_03.mp4");
                startActivity(intent);
            }
        });

        sun11_5_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_04.mp4");
                startActivity(intent);
            }
        });

        sun11_5_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_05.mp4");
                startActivity(intent);
            }
        });

        sun11_5_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_06.mp4");
                startActivity(intent);
            }
        });
        sun11_5_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_07.mp4");
                startActivity(intent);
            }
        });
        sun11_5_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_08.mp4");
                startActivity(intent);
            }
        });
        sun11_5_9Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_09.mp4");
                startActivity(intent);
            }
        });
        sun11_5_10Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_10.mp4");
                startActivity(intent);
            }
        });
        sun11_5_11Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_11.mp4");
                startActivity(intent);
            }
        });
        sun11_5_12Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_12.mp4");
                startActivity(intent);
            }
        });
        sun11_5_13Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_04_13.mp4");
                startActivity(intent);
            }
        });
    }
}
