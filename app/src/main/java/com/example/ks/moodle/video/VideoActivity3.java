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
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.ks.moodle.MyActivity;
import com.example.ks.moodle.R;
import com.example.ks.moodle.StatisticsHelper;
import com.example.ks.moodle.util.HttpUtil;
import com.example.ks.moodle.util.Register;

import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

public class VideoActivity3 extends Activity implements SeekBar.OnSeekBarChangeListener{
    private VideoView main_vv;
    private Button main_bt_start, main_bt_stop, main_bt_continue;
    private SeekBar seekBarTv;
    private TextView start_time,end_time;
    private String xuehao;
    private String name;
    private String startTime;
    private String endTime;

    private boolean isContinue = true;
    private int id=0;//开始几次
    private int idb=0;//暂停几次
    private int idbc=0;//继续观看几次
    private int repaly=0;//重新观看几次
    private int move=0;//拖动进度条几次
    private RelativeLayout  mVideoLayout;
    private ViewGroup.LayoutParams mVideoLayoutParams;
    private HashMap<String,String> stringHashMap;
    private String dateTime;


    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    if (!isContinue) {

                        start_time.setText(stringForTime(main_vv.getCurrentPosition()+1000));
                        seekBarTv.setProgress(main_vv.getCurrentPosition()+1000);
                    }
                    break;
            }
        }
    };


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);

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
        name=sp.getString("name",null);


        seekBarTv = findViewById(R.id.seekBar);
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
        seekBarTv.setOnSeekBarChangeListener(this);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateTime = simpleDateFormat.format(System.currentTimeMillis());//时间戳



        main_bt_start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            id++;
            stringHashMap = new HashMap<>();
            stringHashMap.put("xuehao", xuehao);
            stringHashMap.put("name", name);
            stringHashMap.put("eventName", "点击开始播放" + id + "次");
            stringHashMap.put("timeStamp", dateTime);
            stringHashMap.put("devicesModel", "型号:" + Build.MODEL);
            stringHashMap.put("systemVersion", "系统版本:" + Build.VERSION.RELEASE);
            new Thread(getRun).start();
        }
        /**
        * get请求线程
        */
        Runnable getRun = new Runnable() {

        @Override
        public void run() {
         // TODO Auto-generated method stub
         HttpUtil.getInstance().requestGet(stringHashMap, "https://www.moodlemooc.cn/moodle-backed/student/event?");
        }
        };



        });



/*
                //事件统计
                StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_play",name,xuehao,"点击开始播放"+id+"次",null);
*/





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
                    StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_replay",name,xuehao,"点击重新播放"+repaly+"次",null);
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


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {



    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //拖动事件统计
        move++;
        startTime=stringForTime(seekBar.getProgress()+1000);
        Log.d("开始拖动时刻", startTime);




    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // 当进度条停止修改的时候触
        // 取得当前进度条的刻度
        endTime=stringForTime(seekBar.getProgress()+1000);
        Log.d("结束拖动时刻", endTime);
        int progress=seekBar.getProgress();
        if(main_vv!=null&&main_vv.isPlaying()){
            //设置当前的播放位置
            main_vv.seekTo(progress);
        }
        stringHashMap = new HashMap<>();
        stringHashMap.put("xuehao", xuehao);
        stringHashMap.put("name", name);
        stringHashMap.put("event_name", "第"+move+"次拖动进度条,从"+startTime+"拖动到"+endTime);
        stringHashMap.put("time_stamp", dateTime);
        stringHashMap.put("devices_model", "型号:" + Build.MODEL);
        stringHashMap.put("system_version", "系统版本:" + Build.VERSION.RELEASE);
        new Thread(getRun).start();
    }
    /**
     * get请求线程
     */
    Runnable getRun = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            HttpUtil.getInstance().requestGet(stringHashMap, "https://www.moodlemooc.cn/moodle-backed/student/event?");

        }
    };
    /*
        StatisticsHelper.getInstance().AddEvent(VideoActivity3.this,"event_move",name,xuehao,
                "第"+move+"次拖动进度条,从"+startTime+"拖动到"+endTime,null);
        */




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

