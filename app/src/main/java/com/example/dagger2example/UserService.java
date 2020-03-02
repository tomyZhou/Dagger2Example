package com.example.dagger2example;

import android.util.Log;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class UserService {

    private static final String TAG = UserService.class.getSimpleName();
    public static final MediaType JSON = MediaType.parse("application/json;charset=utf-8");
    private OkHttpClient mOkHttpClient;

    public UserService(OkHttpClient okHttpClient) {
        mOkHttpClient = okHttpClient;
    }

//    @Inject
//    public UserService(String url) {
//        Log.e(TAG, "url ====" + url);
//    }

    public void register() {
        //请求网络，注册
        Log.e(TAG, "调用UserSerivice"+mOkHttpClient);


        RequestBody body = RequestBody.create(JSON, "");
        Request request = new Request.Builder().url("http://www.wanandroid.com/project/list/1/json?cid=1")
                .post(body)
                .build();
        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

            }
        });

    }

    public void login(){
        Log.e(TAG,"userService 调用了login方法"+mOkHttpClient);
    }
}
