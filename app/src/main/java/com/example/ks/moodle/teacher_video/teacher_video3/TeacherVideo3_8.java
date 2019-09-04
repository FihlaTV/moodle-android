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

public class TeacherVideo3_8 extends TB {
    Toolbar toolbar;
    private TextView sun3_8Tv;
    private TextView tan3_8Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_8);;

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sun3_8Tv=(TextView)findViewById(R.id.sun3_8);
        tan3_8Tv=(TextView)findViewById(R.id.tan3_8);

        sun3_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_8.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_02_13.mp4");
                startActivity(intent);

            }
        });

        tan3_8Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_8.this,TeacherVideo3_8_2.class);
                startActivity(intent);

            }
        });
    }
}
