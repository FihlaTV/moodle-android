package com.example.ks.moodle;

import android.content.Context;
import android.util.Log;

import com.example.ks.moodle.Bean.EventBean;
import com.example.ks.moodle.db.dao.EventDao;
import com.example.ks.moodle.util.JsonUtil;

import java.util.List;

public class UploadEventThread implements Runnable {
    private Context context;

    public UploadEventThread(Context context){
        this.context=context;
    }
    @Override
    public void run() {
        Log.v("statistic","上传数据的线程执行了");
        isUpload();

    }

    private boolean isUpload() {
        /****start 查询数据库确定需要上传的数据**/
        List<EventBean> list= EventDao.getInstance(context).queryEventList(5);
        /***end 查询数据库确定需要上传的数据***/
        if(list!=null&&list.size()>0){
            upload(list);
            return true;
        }else{
            if(StatisticsHelper.isDebug){
                Log.v("statistic","uploadEventThread-->  上传线程的查询结果为空");
            }
            return false;


        }
    }

    private void upload(List<EventBean> list) {
        if(StatisticsHelper.isDebug){
            Log.v("statistic","查询的数据长度"+list.size());
            Log.v("statistic","查询结果"+ JsonUtil.getInstance().beanToJson(list));
        }try{
            Thread.sleep(5000);

        }catch(InterruptedException e){
            System.out.println("线程异常");
        }
        EventDao.getInstance(context).deleteData(5);
        isUpload();
    }
}
