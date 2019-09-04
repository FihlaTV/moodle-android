package com.example.ks.moodle.video;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.ks.moodle.R;

import java.util.Formatter;
import java.util.Locale;

public class VideoActivity2 extends Activity {
    private VideoView main_vv;
    private Button main_bt_start, main_bt_stop, main_bt_continue;
    private ProgressBar progressBarHorizontal;
    private TextView start_time,end_time;
    private String xuehao;

    private boolean isContinue = true;
    private int id=0;//开始几次
    private int idb=0;//暂停几次
    private int idbc=0;//继续观看几次
    private int repaly=0;//重新观看几次
    private RelativeLayout  mVideoLayout;
    private ViewGroup.LayoutParams mVideoLayoutParams;

    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    if (!isContinue) {

                        start_time.setText(stringForTime(main_vv.getCurrentPosition()+1000));
                        progressBarHorizontal.setProgress(main_vv.getCurrentPosition()+1000);
                    }
                    break;
            }
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.video);

        initView();
        RunTime();
    }

    private void initView() {
        main_vv = findViewById(R.id.main_vv);
        main_bt_start = findViewById(R.id.main_bt_start);
        main_bt_stop = findViewById(R.id.main_bt_stop);
        main_bt_continue = findViewById(R.id.main_bt_continue);

        SharedPreferences sp = getSharedPreferences("XUEHAO", Context.MODE_PRIVATE);
        xuehao = sp.getString("xuehao",null);

        //progressBarHorizontal = findViewById(R.id.progressBarHorizontal);
        start_time = findViewById(R.id.start_time);
        end_time = findViewById(R.id.end_time);
        RelativeLayout.LayoutParams layoutParams=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.FILL_PARENT,
                RelativeLayout.LayoutParams.FILL_PARENT);
        layoutParams.addRule(RelativeLayout.ALIGN_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        main_vv.setLayoutParams(layoutParams);


        main_bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id++;
                //事件统计
                //StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_play"+id,xuehao,"点击开始播放"+id+"次",null);

                if (isContinue) {
                    isContinue = false;
                    main_bt_start.setText("暂停");
                    main_vv.start();
                    //事件统计
                    idbc++;
                    //StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_continue"+idbc,xuehao,"点击继续观看"+idbc+"次",null);
                    main_vv.requestFocus();

                    end_time.setText(stringForTime(main_vv.getDuration()));
                    progressBarHorizontal.setMax(main_vv.getDuration());
                    // 视频总长度

                } else {
                    isContinue = true;
                    main_bt_start.setText("继续");
                    if (main_vv.canPause()) {
                        main_vv.pause();
                        idb++;
                        //事件统计
                       // StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_pause"+idb,xuehao,"点击暂停"+idb+"次",null);
                    }
                }

            }
        });
        main_bt_stop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

//                if (main_vv.isPlaying()){
//                    main_vv.stopPlayback();
//                }
            }
        });
        main_bt_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (main_vv.isPlaying()) {
                    main_vv.resume();//重新播放
                    //事件统计
                    repaly++;
                   // StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_replay"+repaly,xuehao,"重新播放"+repaly+"次",null);
                }
            }
        });


        Intent intent=getIntent();
        main_vv.setVideoURI(android.net.Uri.parse(intent.getStringExtra("url")));
        main_vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {  //  播放完成
                isContinue = true;
                main_bt_start.setText("开始");

//                mp.setLooping(true);//设置循环播放
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)


    private void RunTime() {
        Thread thread;
        final boolean readCard = true;

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (readCard){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    handler.sendEmptyMessage(1);

                }

            }
        });

        thread.start();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (main_vv != null) {
            main_vv.suspend();
        }
    }


    /**
     * 把毫秒转换成：1：20：30这样的形式
     *
     * @param timeMs
     * @return
     */
    public String stringForTime(int timeMs) {
        StringBuilder mFormatBuilder = new StringBuilder();
        Formatter mFormatter = new Formatter(mFormatBuilder, Locale.getDefault());

        int totalSeconds = timeMs / 1000;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;
        mFormatBuilder.setLength(0);
        if (hours > 0) {
            return mFormatter.format("%d:%02d:%02d", hours, minutes, seconds).toString();
        } else {
            return mFormatter.format("%02d:%02d", minutes, seconds).toString();
        }
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
