package com.example.yueguang89.weather;

import android.app.Application;

import com.baidu.apistore.sdk.ApiStoreSDK;

/**
 * Created by yueguang89 on 2016/6/11.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiStoreSDK.init(this, "2c238fba1b1153bf8894d13f0858ccc4");

    }
}
