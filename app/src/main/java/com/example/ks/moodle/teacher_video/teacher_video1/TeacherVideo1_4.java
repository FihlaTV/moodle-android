package com.example.ks.moodle.teacher_video.teacher_video1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo1_4 extends TB {
    Toolbar toolbar;
    private TextView chen4Tv;
    private TextView chener4Tv;
    private TextView qi4Tv;
    private TextView sun4Tv;

    @Override
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_4);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        chen4Tv=(TextView)findViewById(R.id.chen4);
        chener4Tv=(TextView)findViewById(R.id.chener4);
        qi4Tv=(TextView)findViewById(R.id.qi4);
        sun4Tv=(TextView)findViewById(R.id.sun4);
        chen4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_4.this, TeacherVideo1_4_1.class);
                startActivity(intent);
            }
        });
        chener4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_4.this, TeacherVideo1_4_2.class);
                startActivity(intent);
            }
        });
        sun4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_4.this, TeacherVideo1_4_3.class);
                startActivity(intent);
            }
        });
        qi4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_4.this, TeacherVideo1_4_4.class);
                startActivity(intent);
            }
        });

    }
}
