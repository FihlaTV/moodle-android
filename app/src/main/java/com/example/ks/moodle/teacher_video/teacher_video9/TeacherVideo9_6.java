package com.example.ks.moodle.teacher_video.teacher_video9;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo9_6 extends TB {
    private TextView sun9_6Tv;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher9_6);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun9_6Tv = (TextView)findViewById(R.id.sun9_6);

        sun9_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo9_6.this,TeacherVideo9_6_1.class);
                startActivity(intent);
            }
        });
    }
}
