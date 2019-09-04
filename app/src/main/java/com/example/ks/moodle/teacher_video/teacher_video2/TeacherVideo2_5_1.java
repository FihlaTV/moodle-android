package com.example.ks.moodle.teacher_video.teacher_video2;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;
import com.example.ks.moodle.video.VideoActivity3;

public class TeacherVideo2_5_1 extends TB {
    Toolbar toolbar;
    private TextView shuzizidiandeneirongTv;
    private TextView shujvzidiandeyongtuTv;
    private TextView shuzizidiandeshixianTv;

    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.teacher2_5_1);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        shuzizidiandeneirongTv=(TextView)findViewById(R.id.shuzizidiandeneirong);
        shujvzidiandeyongtuTv=(TextView)findViewById(R.id.shujvzidiandeyongtu);
        shuzizidiandeshixianTv=(TextView)findViewById(R.id.shuzizidiandeshixian);

        shuzizidiandeneirongTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(TeacherVideo2_5_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_01_09.mp4");
                startActivity(intent);
            }
        });

        shujvzidiandeyongtuTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(TeacherVideo2_5_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_01_10.mp4");
                startActivity(intent);
            }
        });

        shuzizidiandeshixianTv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent=new Intent(TeacherVideo2_5_1.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_04_01_19.mp4");
                startActivity(intent);
            }
        });
    }
}
