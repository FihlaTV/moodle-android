package com.example.ks.moodle.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.example.ks.moodle.Bean.EventBean;
import com.example.ks.moodle.StatisticsHelper;
import com.example.ks.moodle.db.dao.EventDao;
import com.example.ks.moodle.util.JsonUtil;

import java.util.List;


/**
 * 上传统计数据
 */
public class UploadService extends Service {

    @Override
    public void onCreate(){
        super.onCreate();
        Log.v("statistic","Service->onCreate");
        isUpload();
    }



    @Override
    public IBinder onBind(Intent intent) {
        Log.v("statistic","Service->onBind");
        return null;
    }
    @Override
    public ComponentName startService(Intent service){
        Log.v("statistic","Service->startService");
        return super.startService(service);
    }

    @Override
    public void onDestroy(){
        Log.v("statistic","Service->onDestroy");
        super.onDestroy();
    }

    private boolean isUpload() {
        /*** start 查询数据库确定需要上传的数据 **/
        List<EventBean> list = EventDao.getInstance(this).queryEventList(5);
        /*** end 查询数据库确定需要上传的数据 **/

        if(list != null && list.size() >0){
            upload(list);
            return true;
        }else{
            if(StatisticsHelper.isDebug){
                Log.v("statistic","uploadEventThread-->  上传线程的查询结果为空");
            }
            return false;
        }
    }

    private void upload(List<EventBean> list){
        if(StatisticsHelper.isDebug){
            Log.v("statistic","uploadEventThread-->  查询的数据长度" + list.size());
            Log.v("statistic","uploadEventThread-->  查询结果：" + JsonUtil.getInstance().beanToJson(list));

        }
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("线程异常...");
        }

        EventDao.getInstance(this).deleteData(5);
        isUpload();
    }
    }

