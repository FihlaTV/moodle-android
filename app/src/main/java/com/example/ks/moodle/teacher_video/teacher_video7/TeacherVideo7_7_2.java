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

public class TeacherVideo7_7_2 extends TB {
    Toolbar toolbar;
    private TextView dong7_7_1Tv;
    private TextView dong7_7_2Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_7_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        dong7_7_1Tv = (TextView) findViewById(R.id.dong7_7_1);
        dong7_7_2Tv = (TextView) findViewById(R.id.dong7_7_2);


        dong7_7_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo7_7_2.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_06_02_05.mp4");
                startActivity(intent);
            }
        });

        dong7_7_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo7_7_2.this, VideoActivity3.class);
                intent.putExtra("url", "http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_06_02_07.mp4");
                startActivity(intent);
            }
        });

    }
}
