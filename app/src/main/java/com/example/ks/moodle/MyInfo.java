package com.example.ks.moodle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyInfo extends Activity {

    private ImageView touxiangImg;
    private TextView nameTv;
    private Button resetPwTv;
    private Button goTv;
    private String name;
    private String major;
    private String xuehao;
    private TextView majorTv;
    private TextView xueTv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myinfo);
        touxiangImg=(ImageView) findViewById(R.id.touxiang);
        majorTv=(TextView) findViewById(R.id.major);
        xueTv=(TextView) findViewById(R.id.xue);
        SharedPreferences sp = getSharedPreferences("XUEHAO", Context.MODE_PRIVATE);
        xuehao = sp.getString("xuehao",null);
        name=sp.getString("name",null);
        major=sp.getString("major",null);
        majorTv.setText(major);
        xueTv.setText(xuehao);
        nameTv=(TextView) findViewById(R.id.name);
        nameTv.setText(name);
        resetPwTv=(Button) findViewById(R.id.resetPassword);
        resetPwTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MyInfo.this,ResetPass_Dialog.class);
                startActivity(intent);
            }
        });
        goTv=(Button) findViewById(R.id.godown);
        goTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MyInfo.this,MyActivity.class);
                startActivity(intent);
            }
        });


    }
}
