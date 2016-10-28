package com.example.yueguang89.weather;

import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yueguang89 on 2016/6/11.
 *
 * 向SD卡中写入地址数据库以便读取
 *
 */
public class WriteToSD {
    private Context context;
    String filePath = android.os.Environment.getExternalStorageDirectory()+"/weather";

    public WriteToSD(Context context){
        this.context = context;
        //判断数据库是否存在
        if(!isExist()){
            write();
        }
    }

    private void write(){
        InputStream inputStream;
        try {
            inputStream = context.getResources().getAssets().open("address.db", 3);
            File file = new File(filePath);
            if(!file.exists()){
                file.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(filePath + "/address.db");
            byte[] buffer = new byte[512];
            int count = 0;
            while((count = inputStream.read(buffer)) > 0){
                fileOutputStream.write(buffer, 0 ,count);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean isExist(){
        File file = new File(filePath + "/address.db");
        if(file.exists()){
            return true;
        }else{
            return false;
        }
    }
}
