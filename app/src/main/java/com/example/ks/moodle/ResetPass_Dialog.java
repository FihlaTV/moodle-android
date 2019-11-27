package com.example.ks.moodle;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ks.moodle.util.MyDatabaseHelper;

import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

import static android.content.ContentValues.TAG;

public class ResetPass_Dialog extends Activity implements View.OnClickListener {
    private Context context;
    private EditText resetIdTv;
    private EditText resetNewPwdTv;
    private EditText resetNewPwdTv2;
    private Button resetBtn;
    private Button backBtn;
    private SQLiteDatabase db;
    private HashMap<String,String> stringHashMap;
    private String result = "";



    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        this.setContentView(R.layout.resetpwd_dialog);
        resetIdTv=(EditText)findViewById(R.id.xuehao2);
        resetNewPwdTv=(EditText)findViewById(R.id.mima2);
        resetNewPwdTv2=(EditText)findViewById(R.id.newmima);
        resetBtn=(Button)findViewById(R.id.reset);
        backBtn=(Button)findViewById(R.id.back2);
        resetBtn.setOnClickListener(this);
        backBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.reset:
                isResetPass();
                break;

            case R.id.back2:
               Intent i=new Intent(ResetPass_Dialog.this,MyInfo.class);
               startActivity(i);
               break;
        }

    }

    /**
     * 账号与改密口令验证
     * 修改密码
     * @return
     */
    private void isResetPass() {
        boolean isReSetPassFinish = false;
        String userId = resetIdTv.getText().toString();
        String passwd = resetNewPwdTv.getText().toString();
        String newPwd = resetNewPwdTv2.getText().toString();
        stringHashMap = new HashMap<>();
        SharedPreferences sp = getSharedPreferences("XUEHAO", Context.MODE_PRIVATE);
        String xuehao = sp.getString("xuehao",null);

        if (userId.equals("") || passwd.equals("") || newPwd.equals("")) {
            Toast.makeText(this, "请输入改密所需的每项内容", Toast.LENGTH_SHORT).show();
        } else if (!passwd.equals(newPwd)) {
            Toast.makeText(this, "请保持两次新密码一致", Toast.LENGTH_SHORT).show();
        } else if(!userId.equals(xuehao)) {
            Toast.makeText(this, "学号不正确，请重新输入", Toast.LENGTH_SHORT).show();
        } else if(passwd.length() < 6) {
            Toast.makeText(this, "密码小于六位数，请重新输入", Toast.LENGTH_SHORT).show();

        } else {
            stringHashMap.put("xuehao", userId);
            stringHashMap.put("passWord", newPwd);
            new Thread(getRun).start();

        }
    }

    /**
     * get请求线程
     */
    Runnable getRun = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            requestGet(stringHashMap);
        }
    };

    private void requestGet(HashMap<String, String> paramsMap) {
        try {
            String baseUrl = "https://www.moodlemooc.cn/moodle-backed/student/modifyPassword?";
            StringBuilder tempParams = new StringBuilder();
            int pos = 0;
            for (String key : paramsMap.keySet()) {
                if (pos > 0) {
                    tempParams.append("&");
                }
                tempParams.append(String.format("%s=%s", key, URLEncoder.encode(paramsMap.get(key), "utf-8")));
                pos++;
            }

            Log.e(TAG,"params--get-->>"+tempParams.toString());

            String requestUrl = baseUrl + tempParams.toString();
            // 新建一个URL对象
            URL url = new URL(requestUrl);
            // 打开一个HttpURLConnection连接
            HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
            // 设置连接主机超时时间
            urlConn.setConnectTimeout(5 * 1000);
            //设置从主机读取数据超时
            urlConn.setReadTimeout(5 * 1000);
            // 设置是否使用缓存  默认是true
            urlConn.setUseCaches(true);
            // 设置为Post请求
            urlConn.setRequestMethod("GET");
            //urlConn设置请求头信息
            //设置请求中的媒体类型信息。
            urlConn.setRequestProperty("Content-Type", "application/json");
            //设置客户端与服务连接类型
            urlConn.addRequestProperty("Connection", "Keep-Alive");
            // 开始连接
            urlConn.connect();
            // 判断请求是否成功
            if (urlConn.getResponseCode() == 200) {
                // 获取返回的数据
                result = streamToString(urlConn.getInputStream());
                Log.e(TAG, "Get方式请求成功，result--->" + result);


                JSONObject jsonObject = new JSONObject(result);
                String msg = jsonObject.getString("msg");
                Log.d("ks",msg);
                if(msg.equals("密码修改成功")) {
                    Intent intent=new Intent(ResetPass_Dialog.this,MyActivity.class);
                    startActivity(intent);
                    Looper.prepare();
                    Toast.makeText(ResetPass_Dialog.this, "密码修改成功", Toast.LENGTH_SHORT).show();
                    Looper.loop();


                } else{
                    //success();
                    Looper.prepare();
                    Toast.makeText(ResetPass_Dialog.this, "此学号不存在", Toast.LENGTH_SHORT).show();
                    Looper.loop();


                }



            } else {
                Log.e(TAG, "Get方式请求失败");
            }
            // 关闭连接
            urlConn.disconnect();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }

    }



    private String streamToString(InputStream is) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            baos.close();
            is.close();
            byte[] byteArray = baos.toByteArray();
            return new String(byteArray);
        } catch (Exception e) {
            Log.e(TAG, e.toString());
            return null;
        }

        }

    }

