package com.example.ks.moodle.video;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.ks.moodle.CutomMediaController;
import com.example.ks.moodle.R;

public class ControllerActivity extends Activity {
    private VideoView vv_video;
    private MediaController mediaControllerller;
    private CutomMediaController cutomMediaController;
    private RelativeLayout  mVideoLayout;
    private ViewGroup.LayoutParams mVideoLayoutParams;
    private String Uri="http://222.29.159.118/mp4files/1245000001542D72/software-moodle.oss-cn-qingdao.aliyuncs.com/moodle_vedio/beidawlf_01_02_02.mp4";
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_controller);
        vv_video=(VideoView)findViewById(R.id.vv_video);
        mVideoLayout=(RelativeLayout)findViewById(R.id.video_layout);
        RelativeLayout.LayoutParams layoutParams=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,
                RelativeLayout.LayoutParams.FILL_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        vv_video.setLayoutParams(layoutParams);
        //实例化MediaController
        cutomMediaController=new CutomMediaController(this);
      //  File file =new File("/sdcard/english.mp4");
        Intent intent=getIntent();
       // String url=intent.getStringExtra("url");
        //String url1=intent.getStringExtra("url");
        vv_video.setVideoURI(android.net.Uri.parse(intent.getStringExtra("url")));

        vv_video.setMediaController(cutomMediaController);
        cutomMediaController.setMediaPlayer(vv_video);

        cutomMediaController.setPrevNextListeners(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ks","ning");
                Toast.makeText(ControllerActivity.this, "下一个", Toast.LENGTH_SHORT).show();

            }
        }, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ControllerActivity.this,"上一个",Toast.LENGTH_SHORT).show();
            }
        });

        /*
        if(file.exists()){
            //设置播放视频的路径
            vv_video.setVideoPath(file.getAbsolutePath());
            //为VideoView指定MediaController
            vv_video.setMediaController(mContriller);
            //为MediaController指定控制的VideoView
            mContriller.setMediaPlayer(vv_video);
            // 增加监听上一个和下一个的切换事件，默认这两个按钮是不显示的

        }
*/
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);
        int rot=getWindowManager().getDefaultDisplay().getRotation();
        if(rot== Surface.ROTATION_90||rot==Surface.ROTATION_270){
             mVideoLayoutParams = mVideoLayout.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams=new RelativeLayout.LayoutParams(
                    RelativeLayout.LayoutParams.FILL_PARENT,
                    RelativeLayout.LayoutParams.FILL_PARENT);
            layoutParams.addRule(RelativeLayout.ALIGN_BOTTOM);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            mVideoLayout.setLayoutParams(layoutParams);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);



        }else if(rot==Surface.ROTATION_0){
            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(320,240);
             lp.addRule(RelativeLayout.CENTER_IN_PARENT);
            mVideoLayout.setLayoutParams(mVideoLayoutParams);

        }

    }


}
