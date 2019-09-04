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

public class TeacherVideo7_7 extends TB {
    Toolbar toolbar;
    private TextView sun7_7Tv;
    private TextView dong7_7Tv;
    private TextView chen7_7Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_7);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun7_7Tv=(TextView)findViewById(R.id.sun7_7);
        dong7_7Tv=(TextView)findViewById(R.id.dong7_7);
        chen7_7Tv=(TextView)findViewById(R.id.chen7_7);

        sun7_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_7.this,TeacherVideo7_7_1.class);
                startActivity(intent);
            }
        });

        dong7_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_7.this, TeacherVideo7_7_2.class);
                startActivity(intent);
            }
        });

        chen7_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo7_7.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_04_04_04.mp4");
                startActivity(intent);
            }
        });
    }


}
