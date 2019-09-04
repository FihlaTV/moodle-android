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

public class TeacherVideo3_1_1 extends TB {
    Toolbar toolbar;
    private TextView xingzhiTv;
    private TextView fenleiTv;
    private TextView gongnengTv;
    private TextView xingnengTv;
    private TextView waibujiekouTv;
    private TextView shejiyueshuTv;
    private TextView zhiliangshuxingTv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher3_1_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        xingzhiTv=(TextView)findViewById(R.id.xingzhi);
        fenleiTv=(TextView)findViewById(R.id.fenlei);
        gongnengTv=(TextView)findViewById(R.id.gongneng);
        xingnengTv=(TextView)findViewById(R.id.xingneng);
        waibujiekouTv=(TextView)findViewById(R.id.waibujiekou);
        shejiyueshuTv=(TextView)findViewById(R.id.shejiyueshu);
        zhiliangshuxingTv=(TextView)findViewById(R.id.zhiliangshuxing);

        xingzhiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.117/mp4files/105300000161A26E/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_10.mp4");
                startActivity(intent);
            }
        });

        fenleiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_11.mp4");
                startActivity(intent);
            }
        });

        gongnengTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.117/mp4files/1055000001623355/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_12.mp4");
                startActivity(intent);
            }
        });

        xingnengTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_13.mp4");
                startActivity(intent);
            }
        });

        waibujiekouTv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
            intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_14.mp4");
            startActivity(intent);
        }
        });

        shejiyueshuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.119/mp4files/118600000162B27B/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_15.mp4");
                startActivity(intent);
            }
        });

        zhiliangshuxingTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TeacherVideo3_1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_03_01_16.mp4");
                startActivity(intent);
            }
        });



    }
}
