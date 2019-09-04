package com.example.ks.moodle.teacher_video.teacher_video7;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo7_2 extends TB {
    private TextView sun7_2Tv;
    Toolbar toolbar;
    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher7_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun7_2Tv = (TextView) findViewById(R.id.sun7_2);
        sun7_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo7_2.this,TeacherVideo7_2_1.class);
                startActivity(intent);
            }
        });
    }
}