package com.example.dagger2example;

import android.app.Application;

public class MyAppliccatioin extends Application {

    private HttpComponent mHttpComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mHttpComponent = DaggerHttpComponent.create();
    }

    public HttpComponent getHttpComponent() {
        return mHttpComponent;
    }
}
