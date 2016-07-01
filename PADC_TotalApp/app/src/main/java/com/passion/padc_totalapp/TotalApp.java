package com.passion.padc_totalapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by NayLinAung on 6/30/2016.
 */
public class TotalApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        context = null;
    }

    public static Context getContext() {
        return context;
    }
}
