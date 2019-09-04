package com.example.ks.moodle.teacher_video.teacher_video3;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo3_3_2 extends TB {
    Toolbar toolbar;
    private TextView sun3_3_1Tv;
    private TextView sun3_3_2Tv;
    private TextView sun3_3_3Tv;
    private TextView sun3_3_4Tv;
    private TextView sun3_3_5Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);;
        setContentView(R.layout.teacher3_3_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun3_3_1Tv=(TextView)findViewById(R.id.sun3_3_1);
        sun3_3_2Tv=(TextView)findViewById(R.id.sun3_3_2);
        sun3_3_3Tv=(TextView)findViewById(R.id.sun3_3_3);
        sun3_3_4Tv=(TextView)findViewById(R.id.sun3_3_4);
        sun3_3_5Tv=(TextView)findViewById(R.id.sun3_3_5);

        sun3_3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_08.mp4");
                startActivity(intent);
            }
        });

        sun3_3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_2.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_09.mp4");
                startActivity(intent);
            }
        });

        sun3_3_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_2.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_10.mp4");
                startActivity(intent);
            }
        });
        sun3_3_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_2.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_11.mp4");
                startActivity(intent);
            }
        });

        sun3_3_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3_2.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_12.mp4");
                startActivity(intent);
            }
        });

    }
}
