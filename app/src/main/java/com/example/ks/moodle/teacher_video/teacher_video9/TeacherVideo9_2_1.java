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

public class TeacherVideo9_2_1 extends TB {
    Toolbar toolbar;
    private TextView sun9_2_1Tv;
    private TextView sun9_2_2Tv;
    private TextView sun9_2_3Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_2_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun9_2_1Tv = (TextView)findViewById(R.id.sun9_2_1);
        sun9_2_2Tv = (TextView)findViewById(R.id.sun9_2_2);
        sun9_2_3Tv = (TextView)findViewById(R.id.sun9_2_3);

        sun9_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_2_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_07.mp4");
                startActivity(intent);
            }
        });
        sun9_2_2Tv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(TeacherVideo9_2_1.this, VideoActivity3.class);
               intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_08.mp4");
               startActivity(intent);
           }
        });
        sun9_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_2_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_01_09.mp4");
                startActivity(intent);
            }
        });
    }
}
