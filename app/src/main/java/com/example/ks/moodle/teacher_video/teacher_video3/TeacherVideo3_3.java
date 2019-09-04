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

public class TeacherVideo3_3 extends TB {
    Toolbar toolbar;
    private TextView chen3_3Tv;
    private TextView sun3_3Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_3);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        chen3_3Tv=(TextView)findViewById(R.id.chen3_3);
        sun3_3Tv=(TextView)findViewById(R.id.sun3_3);

        chen3_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo3_3.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_04.mp4");
                startActivity(intent);
            }
        });
        sun3_3Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo3_3.this,TeacherVideo3_3_2.class);
            startActivity(intent);
        }
    });
    }
}
