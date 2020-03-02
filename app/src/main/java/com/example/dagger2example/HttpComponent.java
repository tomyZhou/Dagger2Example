package com.example.dagger2example;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;

@Singleton
@Component(modules = {HttpModule.class})
public interface HttpComponent {
    OkHttpClient okHttpClient(); //重要，将HttpModule生成的OkHttpClient对象暴露出来！
}
