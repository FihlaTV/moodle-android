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

public class TeacherVideo9_6_1 extends TB {
    private TextView sun9_6_51_6Tv;
    private TextView sun9_6_51_7Tv;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_6_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun9_6_51_6Tv = (TextView)findViewById(R.id.sun9_6_51_6);
        sun9_6_51_7Tv = (TextView)findViewById(R.id.sun9_6_51_7);

        sun9_6_51_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_6_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_06.mp4");
                startActivity(intent);
            }
        });
        sun9_6_51_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo9_6_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_07_05_07.mp4");
                startActivity(intent);
            }
        });
    }
}
