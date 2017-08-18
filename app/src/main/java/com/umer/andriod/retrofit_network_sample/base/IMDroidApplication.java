package com.umer.andriod.retrofit_network_sample.base;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

public class IMDroidApplication extends Application {
    public static String TAG = "InspectionManagerApplication";
    private static IMDroidApplication instance;
    public static Context context;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        IMDroidApplication.context = getApplicationContext();
    }


    public IMDroidApplication() {
    }

    public static IMDroidApplication getInstance() {
        return IMDroidApplication.instance;
    }

    public static Context getAppContext() {
        return instance;
    }

    public static Resources getAppResources() {
        return instance.getResources();
    }


}