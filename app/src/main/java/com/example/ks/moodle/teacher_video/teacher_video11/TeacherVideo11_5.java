package com.example.ks.moodle.teacher_video.teacher_video11;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

public class TeacherVideo11_5 extends TB {
    private TextView sun11_5Tv;
    Toolbar toolbar;
    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_5);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun11_5Tv = (TextView) findViewById(R.id.sun11_5);
        sun11_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo11_5.this,TeacherVideo11_5_1.class);
                startActivity(intent);
            }
        });
    }
}