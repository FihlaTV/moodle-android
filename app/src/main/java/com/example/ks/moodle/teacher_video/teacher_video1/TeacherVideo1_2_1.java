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

public class TeacherVideo1_2_1 extends TB {
    Toolbar toolbar;
    private TextView chen1_2_1Tv;
    private TextView chen1_2_2Tv;
    private TextView chen1_2_3Tv;
    private TextView chen1_2_4Tv;

    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_2_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chen1_2_1Tv=(TextView)findViewById(R.id.chen1_2_1);
        chen1_2_2Tv=(TextView)findViewById(R.id.chen1_2_2);
        chen1_2_3Tv=(TextView)findViewById(R.id.chen1_2_3);
        chen1_2_4Tv=(TextView)findViewById(R.id.chen1_2_4);

        chen1_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_02_01.mp4");
                startActivity(intent);
            }
        });
        chen1_2_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_02_03.mp4");
                startActivity(intent);

            }
        });
        chen1_2_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_02_08.mp4");
                startActivity(intent);
            }
        });
        chen1_2_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_2_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_03_01.mp4");
                startActivity(intent);
            }
        });

    }
}
