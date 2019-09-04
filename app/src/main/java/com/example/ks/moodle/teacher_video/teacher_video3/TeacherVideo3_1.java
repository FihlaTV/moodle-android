package com.example.ks.moodle.teacher_video.teacher_video3;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo3_1 extends TB {
    Toolbar toolbar;
    private TextView sun3_1Tv;
    private TextView chen3_1Tv;
    private TextView tan3_1Tv;

    @Override

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun3_1Tv=(TextView)findViewById(R.id.sun3_1);
        chen3_1Tv=(TextView)findViewById(R.id.chen3_1);
        tan3_1Tv=(TextView)findViewById(R.id.tan3_1);

        sun3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_1.this,TeacherVideo3_1_1.class);
                startActivity(intent);
            }
        });

        chen3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_1.this,TeacherVideo3_1_2.class);
                startActivity(intent);
            }
        });

        tan3_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TeacherVideo3_1.this,TeacherVideo3_1_3.class);
                startActivity(intent);
            }
        });


    }


}
