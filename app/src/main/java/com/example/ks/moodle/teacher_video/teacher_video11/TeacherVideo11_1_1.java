package com.example.ks.moodle.teacher_video.teacher_video11;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo11_1_1 extends TB {
    Toolbar toolbar;
    private TextView sun11_1_1Tv;
    private TextView sun11_1_2Tv;
    private TextView sun11_1_3Tv;
    private TextView sun11_1_4Tv;
    private TextView sun11_1_5Tv;
    private TextView sun11_1_6Tv;
    private TextView sun11_1_7Tv;
    private TextView sun11_1_8Tv;
    private TextView sun11_1_9Tv;
    private TextView sun11_1_10Tv;
    private TextView sun11_1_11Tv;
    private TextView sun11_1_12Tv;
    private TextView sun11_1_13Tv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher11_1_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        sun11_1_1Tv=(TextView)findViewById(R.id.sun11_1_1);
        sun11_1_2Tv=(TextView)findViewById(R.id.sun11_1_2);
        sun11_1_3Tv=(TextView)findViewById(R.id.sun11_1_3);
        sun11_1_4Tv=(TextView)findViewById(R.id.sun11_1_4);
        sun11_1_5Tv=(TextView)findViewById(R.id.sun11_1_5);
        sun11_1_6Tv=(TextView)findViewById(R.id.sun11_1_6);
        sun11_1_7Tv=(TextView)findViewById(R.id.sun11_1_7);
        sun11_1_8Tv=(TextView)findViewById(R.id.sun11_1_8);
        sun11_1_9Tv=(TextView)findViewById(R.id.sun11_1_9);
        sun11_1_10Tv=(TextView)findViewById(R.id.sun11_1_10);
        sun11_1_11Tv=(TextView)findViewById(R.id.sun11_1_11);
        sun11_1_12Tv=(TextView)findViewById(R.id.sun11_1_12);
        sun11_1_13Tv=(TextView)findViewById(R.id.sun11_1_13);


        sun11_1_1Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_01.mp4");
                startActivity(intent);
            }
        });

        sun11_1_2Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_02.mp4");
                startActivity(intent);
            }
        });

        sun11_1_3Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_03.mp4");
                startActivity(intent);
            }
        });

        sun11_1_4Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_04.mp4");
                startActivity(intent);
            }
        });

        sun11_1_5Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_05.mp4");
                startActivity(intent);
            }
        });

        sun11_1_6Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_06.mp4");
                startActivity(intent);
            }
        });
        sun11_1_7Tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_07.mp4");
                startActivity(intent);
            }
        });
        sun11_1_8Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_08.mp4");
            startActivity(intent);
        }
    });
        sun11_1_9Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_09.mp4");
            startActivity(intent);
        }
    });
        sun11_1_10Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_10.mp4");
            startActivity(intent);
        }
    });
        sun11_1_11Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_11.mp4");
            startActivity(intent);
        }
    });
        sun11_1_12Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_12.mp4");
            startActivity(intent);
        }
    });
        sun11_1_13Tv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(TeacherVideo11_1_1.this,VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_08_03_13.mp4");
            startActivity(intent);
        }
    });
    }
}
