package com.example.ks.moodle;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/* 创建TB继承自AppCompatActivity,重写onOptionsItemSelected方法，实现toolbar的后退功能
* */
public class TB extends AppCompatActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
