package com.leeway.mvcstructure;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by Lee Lorz on 12/27/2016.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // initialize thing(s) here
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
