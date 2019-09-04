package com.example.ks.moodle;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StartPhoto extends AppCompatActivity {
    public static final int TAKE_PHOTO = 1;
    private ImageView picture;
    private Uri imageUri;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.ing);
        Button takePhoto = (Button) findViewById(R.id.take_photo);
        picture = (ImageView) findViewById(R.id.picture);
        takePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //创建File对象，用于存储拍照后的照片
                //getExternalCacheDir()方法将图片存放在应用关联缓存目录下,也就是/sdcard/Android/data/应用的包名/cache中
                File outputImage = new File(getExternalCacheDir(), "output_image.jpg");
                try {
                    //如果文件存在则删除，新创建一个文件
                    if (outputImage.exists()) {
                        outputImage.delete();
                    }
                    outputImage.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                /*如果运行设备的系统版本低于Android7.0,就调用Uri的fromFile()方法
                 * 将File对象转换成Uri对象，这个Uri对象标识着output_image.jpg这张
                 * 图片的本地真实路径;否则调用FileProvider的getUriForFile()方法将File
                 * 对象转换成一个封装过的Uri对象。
                 * 三个参数: Context对象 任意唯一的字符串 File对象
                 * 因为Android7.0之后就认为直接使用本地真实路径Uri是不安全的，会抛出FileUriExposed
                 * Exception异常。而FileProvider使用一种特殊的内容提供器,它使用了和内容
                 * 提供其类似的机制来对数据进行保护，可以选择性地将封装过的Uri共享给外部，从而提高了
                 * 应用的安全性*/
                //当接口大于24时
                if (Build.VERSION.SDK_INT >= 24) {
                    imageUri = FileProvider.getUriForFile(StartPhoto.this,
                            "com.gougoucompany.clarence.cameraalbumtest.fileprovider", outputImage);
                } else {
                    //接口小于24时
                    imageUri = Uri.fromFile(outputImage);
                }

                //启动相机程序
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                //指定图片的输出地址
                intent.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
                //使用startActivityForResult()方法启动活动，因此拍完照片后会有结果返回到onActivityResult()方法中
                //如果发现拍照成功，就可以调用BitmapFactory的decodeStream()方法将ouput_iamge.jpg这张照片解析成Bitmap
                //对象，然后把它设置到ImageView中显示出来
                intent.putExtra("android.intent.extras.CAMERA_FACING",1);//调用前置摄像头
                intent.putExtra("autofocus",true);//自动对焦
                startActivityForResult(intent, TAKE_PHOTO);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case TAKE_PHOTO:
                if (resultCode == RESULT_OK) {
                    try {
                        //将拍摄的照片显示出来
                        Bitmap bitmap = BitmapFactory.decodeStream(getContentResolver().openInputStream(imageUri));
                        picture.setImageBitmap(bitmap);
                    }catch (FileNotFoundException e){
                        e.printStackTrace();
                    }
                }
                break;
            default:
                break;
        }
    }
}