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

public class TeacherVideo3_2_2 extends TB {
    Toolbar toolbar;
    private TextView tan3_2_1Tv;
    private TextView tan3_2_2Tv;
    private TextView tan3_2_3Tv;
    private TextView tan3_2_4Tv;
    private TextView tan3_2_5Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_2_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        tan3_2_1Tv=(TextView)findViewById(R.id.tan3_2_1);
        tan3_2_2Tv=(TextView)findViewById(R.id.tan3_2_2);
        tan3_2_3Tv=(TextView)findViewById(R.id.tan3_2_3);
        tan3_2_4Tv=(TextView)findViewById(R.id.tan3_2_4);
        tan3_2_5Tv=(TextView)findViewById(R.id.tan3_2_5);

        tan3_2_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_2_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_05_02.mp4");
                startActivity(intent);
            }
        });

        tan3_2_2Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo3_2_2.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_05_03.mp4");
            startActivity(intent);
        }
    });

       tan3_2_3Tv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(TeacherVideo3_2_2.this,VideoActivity3.class);
               intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_05_04.mp4");
               startActivity(intent);
           }
       });

       tan3_2_4Tv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(TeacherVideo3_2_2.this,VideoActivity3.class);
               intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_05_05.mp4");
               startActivity(intent);
           }
       });

       tan3_2_5Tv.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(TeacherVideo3_2_2.this,VideoActivity3.class);
               intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/guofangkedaqzc_02_05_06.mp4");
               startActivity(intent);
           }
       });
    }
}
