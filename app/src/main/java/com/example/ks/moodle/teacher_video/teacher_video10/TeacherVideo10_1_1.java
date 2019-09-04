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

public class TeacherVideo10_1_1 extends TB {
    Toolbar toolbar;
    private TextView sun10_1_1Tv;
    private TextView sun10_1_2Tv;
    private TextView sun10_1_3Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher10_1_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun10_1_1Tv = (TextView)findViewById(R.id.sun10_1_1);
        sun10_1_2Tv = (TextView)findViewById(R.id.sun10_1_2);
        sun10_1_3Tv = (TextView)findViewById(R.id.sun10_1_3);

        sun10_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_01.mp4");
                startActivity(intent);
            }
        });
        sun10_1_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_02.mp4");
                startActivity(intent);
            }
        });
        sun10_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo10_1_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_01_03.mp4");
                startActivity(intent);
            }
        });
    }
}
