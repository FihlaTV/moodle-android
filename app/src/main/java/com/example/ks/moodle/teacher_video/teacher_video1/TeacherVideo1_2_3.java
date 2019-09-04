package com.example.ks.moodle.teacher_video.teacher_video1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo1_2_3 extends TB {
    Toolbar toolbar;
    private TextView sun1_2_1Tv;
    private TextView sun1_2_2Tv;
    private TextView sun1_2_3Tv;
    private TextView sun1_2_4Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_2_3);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun1_2_1Tv=(TextView)findViewById(R.id.sun1_2_1);
        sun1_2_2Tv=(TextView)findViewById(R.id.sun1_2_2);
        sun1_2_3Tv=(TextView)findViewById(R.id.sun1_2_3);
        sun1_2_4Tv=(TextView)findViewById(R.id.sun1_2_4);
        sun1_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_03_03.mp4");
                startActivity(intent);
            }
        });
        sun1_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_04_02.mp4");
                startActivity(intent);

            }
        });
        sun1_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_04_06.mp4");
                startActivity(intent);
            }
        });
        sun1_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_04_07.mp4");
                startActivity(intent);
            }
        });

    }
}
