package com.example.dagger2example;

import android.util.Log;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;


@Module
public class HttpModule {
    private static final String TAG = HttpModule.class.getSimpleName();

    @Singleton
    @Provides
    public OkHttpClient getOkHttpClient() {
        Log.e(TAG, "OkHttpClient被创建");
        return new OkHttpClient().newBuilder().build();
    }
}
