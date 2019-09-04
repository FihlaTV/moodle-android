package com.example.ks.moodle.teacher_video.teacher_video8;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo8_1 extends TB {
    private TextView mmao8_1Tv;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher8_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        mmao8_1Tv = (TextView)findViewById(R.id.mao8_1);

        mmao8_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo8_1.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_07_01_02.mp4");
                startActivity(intent);
            }
        });
    }
}
