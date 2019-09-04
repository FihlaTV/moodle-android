package com.example.ks.moodle;

import android.app.Activity;
import android.os.Looper;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ks.moodle.entity.Student;
import com.example.ks.moodle.util.HttpUtil;
import com.example.ks.moodle.util.JsonUtil;
import com.example.ks.moodle.util.MyDatabaseHelper;
import com.example.ks.moodle.util.Register;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

import static android.content.ContentValues.TAG;

public class MyActivity extends AppCompatActivity {

    private MyDatabaseHelper dbhelper;
    private Button newUserTv;
    private Button loginBtn;
    private EditText xuehaoTv;
    private EditText pwdTv;
    private SQLiteDatabase db;
    private Student student;
    private CheckBox rememberTv;
    private MyDatabaseHelper myDatabaseHelper;
    private String userId;
    private String password;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    Toolbar toolbar;//定义标题栏
    private HashMap<String,String> stringHashMap;
    private String result = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        /*设置标题栏*/
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        xuehaoTv=(EditText)findViewById(R.id.xuehao);
        pwdTv=(EditText)findViewById(R.id.pwd);

        newUserTv=(Button) findViewById(R.id.regist);
        loginBtn=(Button)findViewById(R.id.login);
        rememberTv=(CheckBox)findViewById(R.id.remember);


//        sp = PreferenceManager.getDefaultSharedPreferences(this);
//        String account = sp.getString("xuehao", "");
//        String password = sp.getString("mima", "");
//
//        xuehaoTv.setText(account);
//        pwdTv.setText(password);







        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isZiDong();



            }
        });

        newUserTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MyActivity.this,Register.class);
                startActivity(i);
            }
        });
        



        }





    private void isZiDong() {
        userId=xuehaoTv.getText().toString();
        password=pwdTv.getText().toString();
        stringHashMap = new HashMap<>();
        /*
        db=new MyDatabaseHelper(this,"moodle1.db",null,2).getReadableDatabase();
        Student student= (Student) db.rawQuery("select name from student where id=1801210729",null);
this,"请输入账号和密码",Toast.LENGTH_SHORT this, "moodle1.db", null, 2
        student.setName("ning");
        Log.d("mo",student.getName());
*/
        if(userId.equals("")||password.equals("")){
            Toast.makeText(MyActivity.this, "请输入账号和密码", Toast.LENGTH_SHORT).show();
        }else{
            stringHashMap.put("xuehao",userId);
            stringHashMap.put("passWord",password);
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
            //HttpUtil.getInstance().requestGet(stringHashMap,"http://10.0.2.2:8080/student/login?");
        }
    };

    private void requestGet(HashMap<String, String> paramsMap) {
        try {
            String baseUrl = "http://10.0.2.2:8080/student/login?";
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
                //String major = jsonObject.getString("major");
                Log.d("ks",msg);
                //String code = jsonObject.getString("code");
                if(msg.equals("登录成功")) {
                    Intent intent=new Intent(MyActivity.this,TestExpendListView.class);
                    startActivity(intent);
                    String name = jsonObject.getString("name");
                    SharedPreferences sp = getSharedPreferences("XUEHAO", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putString("xuehao",userId);
                    editor.putString("password",password);
                    //editor.putString("major",major);
                    editor.putString("name",name);
                    editor.commit();

                } else if(msg.equals("学生学号或密码错误")){
                    //success();
                    Looper.prepare();
                    Toast.makeText(MyActivity.this, "学号或密码错误", Toast.LENGTH_SHORT).show();
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

    private void success() {
        Toast.makeText(MyActivity.this, "学号或密码错误", Toast.LENGTH_SHORT).show();


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


