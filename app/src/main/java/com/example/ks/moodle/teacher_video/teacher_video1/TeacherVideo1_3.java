package com.example.ks.moodle.teacher_video.teacher_video1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.ControllerActivity;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo1_3 extends TB {
    Toolbar toolbar;
    private TextView qi3Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_3);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        qi3Tv=(TextView)findViewById(R.id.qi3);
        qi3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_3.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.120/mp4files/109200000155FB97/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_08.mp4");
                startActivity(intent);
            }
        });
    }
}