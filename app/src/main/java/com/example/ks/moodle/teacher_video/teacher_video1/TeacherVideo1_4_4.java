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

public class TeacherVideo1_4_4 extends TB {
    Toolbar toolbar;
    private TextView qi1_4_1Tv;
    private TextView qi1_4_2Tv;
    private TextView qi1_4_3Tv;
    private TextView qi1_4_4Tv;
    private TextView qi1_4_5Tv;
    private TextView qi1_4_6Tv;

    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_4_4);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        qi1_4_1Tv=(TextView)findViewById(R.id.qi1_4_1);
        qi1_4_2Tv=(TextView)findViewById(R.id.qi1_4_2);
        qi1_4_3Tv=(TextView)findViewById(R.id.qi1_4_3);
        qi1_4_4Tv=(TextView)findViewById(R.id.qi1_4_4);
        qi1_4_5Tv=(TextView)findViewById(R.id.qi1_4_5);
        qi1_4_6Tv=(TextView)findViewById(R.id.qi1_4_6);

        qi1_4_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_02.mp4");
                startActivity(intent);
            }
        });
        qi1_4_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_04.mp4");
                startActivity(intent);

            }
        });
        qi1_4_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_03.mp4");
                startActivity(intent);
            }
        });
        qi1_4_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_05.mp4");
                startActivity(intent);
            }
        });
        qi1_4_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_06.mp4");
                startActivity(intent);
            }
        });
        qi1_4_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_02_07.mp4");
                startActivity(intent);
            }
        });


    }
}
