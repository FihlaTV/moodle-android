package com.example.ks.moodle.teacher_video.teacher_video10;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo10_1 extends TB {
    private TextView sun10_1Tv;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher10_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun10_1Tv = (TextView)findViewById(R.id.sun10_1);

        sun10_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo10_1.this,TeacherVideo10_1_1.class);
                startActivity(intent);
            }
        });
    }
}
