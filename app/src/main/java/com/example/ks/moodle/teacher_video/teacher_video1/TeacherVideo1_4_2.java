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

public class TeacherVideo1_4_2 extends TB {
    Toolbar toolbar;
    private TextView chener1_4_1Tv;
    private TextView chener1_4_2Tv;
    private TextView chener1_4_3Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_4_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chener1_4_1Tv=(TextView)findViewById(R.id.chener1_4_1);
        chener1_4_2Tv=(TextView)findViewById(R.id.chener1_4_2);
        chener1_4_3Tv=(TextView)findViewById(R.id.chener1_4_3);
        chener1_4_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_04_02.mp4");
                startActivity(intent);
            }
        });
        chener1_4_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_04_03.mp4");
                startActivity(intent);

            }
        });
        chener1_4_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_04_05.mp4");
                startActivity(intent);
            }
        });


    }
}
