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

public class TeacherVideo1_2 extends TB {
    Toolbar toolbar;
    private TextView chenTv;
    private TextView meiTv;
    private TextView sunTv;
    private TextView qiTv;
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chenTv=(TextView)findViewById(R.id.chen1_2);
        meiTv=(TextView)findViewById(R.id.mei1_2);
        sunTv=(TextView)findViewById(R.id.sun1_2);
        qiTv=(TextView)findViewById(R.id.qi1_2);
        chenTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_2.this, TeacherVideo1_2_1.class);
                startActivity(intent);
            }
        });
        meiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_2.this, TeacherVideo1_2_2.class);
                startActivity(intent);

            }
        });
        sunTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_2.this, TeacherVideo1_2_3.class);
                startActivity(intent);

            }
        });
        qiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_2.this, TeacherVideo1_2_4.class);
                startActivity(intent);
            }
        });
    }
}
