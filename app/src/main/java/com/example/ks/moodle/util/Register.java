package com.example.ks.moodle.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

//import android.widget.Toolbar;
import com.example.ks.moodle.MyActivity;
import com.example.ks.moodle.R;
import com.example.ks.moodle.TB;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

import static android.content.ContentValues.TAG;

public class Register extends TB {
    private Button register_go;
    private EditText useridTv;
    private EditText pwdTv;
    private EditText pwdTv2;
    private EditText nameTv;
    private EditText descTv;
    private MyDatabaseHelper myDatabaseHelper;
    private Button backBtn;
    Toolbar toolbar;
    private HashMap<String,String> stringHashMap;


    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.regist);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        register_go=(Button)findViewById(R.id.regist);
        useridTv=(EditText)findViewById(R.id.userid);
        pwdTv=(EditText)findViewById(R.id.password);
        pwdTv2=(EditText)findViewById(R.id.password2);
        nameTv=(EditText)findViewById(R.id.name);
        descTv=(EditText)findViewById(R.id.desc);
        backBtn=(Button)findViewById(R.id.back);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Register.this,MyActivity.class);
                startActivity(i);
            }
        });
        register_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterSave();
            }
        });

    }

    private void RegisterSave() {
        String userId=useridTv.getText().toString();
        String password1=pwdTv.getText().toString();
        String password2=pwdTv2.getText().toString();
        String name=nameTv.getText().toString();
        String desc=descTv.getText().toString();
        boolean creatUser=true;
        stringHashMap = new HashMap<>();
        if(userId.equals("")||password1.equals("")||password2.equals("")||name.equals("")){
            Toast.makeText(this,"请完整输入各项注册内容",Toast.LENGTH_SHORT).show();
        }else if(!password1.equals(password2)){
            Toast.makeText(this,"两次密码输入不一致，请重新输入",Toast.LENGTH_SHORT).show();
        }else if(password1.length()<6){
            Toast.makeText(this, "密码小于六位数，请重新输入", Toast.LENGTH_SHORT).show();

        }else{
            stringHashMap.put("xuehao",userId);
            stringHashMap.put("passWord",password1);
            stringHashMap.put("name",name);
            stringHashMap.put("major",desc);
            new Thread(getRun).start();
            Toast.makeText(this,"注册成功",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(Register.this,MyActivity.class);
            startActivity(intent);

        }

    }
    /**
     * get请求线程
     */
    Runnable getRun = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
           HttpUtil.getInstance().requestGet(stringHashMap,"http://10.0.2.2:8080/student/register?");
        }
    };


}

