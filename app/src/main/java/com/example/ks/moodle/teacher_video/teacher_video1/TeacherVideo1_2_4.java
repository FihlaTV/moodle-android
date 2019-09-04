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

public class TeacherVideo1_2_4 extends TB {
    Toolbar toolbar;
    private TextView qi1_2_1Tv;
    private TextView qi1_2_2Tv;
    private TextView qi1_2_3Tv;
    private TextView qi1_2_4Tv;
    private TextView qi1_2_5Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_2_4);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        qi1_2_1Tv=(TextView)findViewById(R.id.qi1_2_1);
        qi1_2_2Tv=(TextView)findViewById(R.id.qi1_2_2);
        qi1_2_3Tv=(TextView)findViewById(R.id.qi1_2_3);
        qi1_2_4Tv=(TextView)findViewById(R.id.qi1_2_4);
        qi1_2_5Tv=(TextView)findViewById(R.id.qi1_2_5);
        qi1_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_02.mp4");
                startActivity(intent);
            }
        });
        qi1_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_06.mp4");
                startActivity(intent);

            }
        });
        qi1_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_09.mp4");
                startActivity(intent);
            }
        });
        qi1_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_11.mp4");
                startActivity(intent);
            }
        });
        qi1_2_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_4.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_01_01_12.mp4");
                startActivity(intent);
            }
        });

    }
}
