package com.example.ks.moodle.teacher_video.teacher_video1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.ControllerActivity;
import com.example.ks.moodle.video.VideoActivity;
import com.example.ks.moodle.video.VideoActivity3;
import com.example.ks.moodle.video.VideoActivity3;


//首先继承Activity
public class TeacherVideo1_1 extends TB {//TB重写onOptionsItemSelected方法，继承自AppCompatActivity类

    private TextView chenTv; //定义第一个文本框
    private TextView meiTv;  //定义第二个文本框
    Toolbar toolbar;         //定义标题栏
    //这个方法用来初始化界面布局的
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher1_1);//填写你刚刚建立的布局名字
        chenTv=(TextView)findViewById(R.id.chen1_1);//找到对应的第一个文本框
        meiTv=(TextView)findViewById(R.id.mei1_1);//找对应的第二个文本框


        /*调用默认的actionbar图标*/
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


/*
        //为第一个文本框的内容设置点击事件
        chenTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //构造一个意图intent，有了意图才能界面跳转
                Intent intent=new Intent(TeacherVideo1_1.this, MyActivity1.class);
                startActivity(intent);
            }
        });
        //为第二个文本框的内容设置点击事件
        meiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //构造一个意图intent，有了意图才能界面跳转
                Intent intent=new Intent(TeacherVideo1_1.this, MyActivity1.class);
                startActivity(intent);
            }
        });
*/
        chenTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_02.mp4");
                startActivity(intent);
            }
        });
        meiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TeacherVideo1_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_02.mp4");
                startActivity(intent);

            }
        });

    }

}
