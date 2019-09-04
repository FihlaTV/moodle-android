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

public class TeacherVideo1_4_1 extends TB {
    Toolbar toolbar;
    private TextView chen1_4_1Tv;
    private TextView chen1_4_2Tv;
    private TextView chen1_4_3Tv;
    private TextView chen1_4_4Tv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_4_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chen1_4_1Tv=(TextView)findViewById(R.id.chen1_4_1);
        chen1_4_2Tv=(TextView)findViewById(R.id.chen1_4_2);
        chen1_4_3Tv=(TextView)findViewById(R.id.chen1_4_3);
        chen1_4_4Tv=(TextView)findViewById(R.id.chen1_4_4);
        chen1_4_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.120/mp4files/518400000157F562/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_05_04.mp4");
                startActivity(intent);
            }
        });
        chen1_4_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.120/mp4files/20570000015E86E2/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_05_05.mp4");
                startActivity(intent);

            }
        });
        chen1_4_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.120/mp4files/20570000015E86E2/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_05_08.mp4");
                startActivity(intent);
            }
        });
        chen1_4_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo1_4_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.120/mp4files/20570000015E86E2/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_01_05_11.mp4");
                startActivity(intent);
            }
        });

    }
}
