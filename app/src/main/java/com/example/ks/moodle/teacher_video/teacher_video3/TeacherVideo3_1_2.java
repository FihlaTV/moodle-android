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

public class TeacherVideo3_1_2 extends TB {
    Toolbar toolbar;
    private TextView zhongyaoxingTv;
    private TextView huoquwentiTv;
    private TextView zhuyaoneirongTv;
    private TextView qishirenwuTv;
    private TextView daochuguochengTv;

    protected void onCreate(Bundle saveInstance)
    {
        super.onCreate(saveInstance);;
        setContentView(R.layout.teacher3_1_2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        zhongyaoxingTv=(TextView)findViewById(R.id.zhongyaoxing);
        huoquwentiTv=(TextView)findViewById(R.id.huoquwenti);
        zhuyaoneirongTv=(TextView)findViewById(R.id.zhuyaoneirong);
        qishirenwuTv=(TextView)findViewById(R.id.qishirenwu);
        daochuguochengTv=(TextView)findViewById(R.id.daochuguocheng);

        zhongyaoxingTv.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(TeacherVideo3_1_2.this, VideoActivity3.class);
            intent.putExtra("url","http://222.29.159.117/mp4files/108900000161C267/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_02_01.mp4");
            startActivity(intent);
        }
        });

        huoquwentiTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_2.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.118/mp4files/121800000161C43B/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_02_02.mp4");
                startActivity(intent);
            }
        });

        zhuyaoneirongTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_2.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.118/mp4files/109100000161C5E5/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_02_03.mp4");
                startActivity(intent);
            }
        });

        qishirenwuTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_2.this, VideoActivity3.class);
                intent.putExtra("url","http://software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_02_04.mp4");
                startActivity(intent);
            }
        });

        daochuguochengTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherVideo3_1_2.this, VideoActivity3.class);
                intent.putExtra("url","http://222.29.159.116/mp4files/2093000001621D30/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/zhedacy_02_02_05.mp4");
                startActivity(intent);
            }
        });

    }
}

