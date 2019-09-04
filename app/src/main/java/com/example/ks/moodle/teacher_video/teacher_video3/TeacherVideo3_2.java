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

public class TeacherVideo3_2 extends TB {
    Toolbar toolbar;
    private TextView sun3_2Tv;
    private TextView tan3_2Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun3_2Tv=(TextView)findViewById(R.id.sun3_2);
        tan3_2Tv=(TextView)findViewById(R.id.tan3_2);

        sun3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_02_01.mp4");
                startActivity(intent);
            }
        });

        tan3_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_2.this,TeacherVideo3_2_2.class);
                startActivity(intent);
            }
        });
    }


}
