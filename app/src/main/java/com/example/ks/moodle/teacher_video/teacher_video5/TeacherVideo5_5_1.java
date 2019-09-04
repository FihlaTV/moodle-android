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

public class TeacherVideo5_5_1 extends TB {
    Toolbar toolbar;
    private TextView sun5_5_1Tv;
    private TextView sun5_5_2Tv;
    private TextView sun5_5_3Tv;
    private TextView sun5_5_4Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher5_5_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun5_5_1Tv=(TextView)findViewById(R.id.sun5_5_1);
        sun5_5_2Tv=(TextView)findViewById(R.id.sun5_5_2);
        sun5_5_3Tv=(TextView)findViewById(R.id.sun5_5_3);
        sun5_5_4Tv=(TextView)findViewById(R.id.sun5_5_4);


        sun5_5_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_5_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_06.mp4");
                startActivity(intent);
            }
        });

        sun5_5_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_07.mp4");
                startActivity(intent);
            }
        });

        sun5_5_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_08.mp4");
                startActivity(intent);
            }
        });

        sun5_5_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo5_5_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_05_01_09.mp4");
                startActivity(intent);
            }
        });
    }
}
