package com.example.dagger2example;

import android.content.Context;
import android.util.Log;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Module 真正创建依赖对象的
 *
 * @author zhoguang@unipus.cn
 * @date 2020/3/2 16:45
 */
//@Module(includes = {HttpModule.class})
@Module
public class UserModule {

    private static final String TAG = UserModule.class.getSimpleName();
    private Context mContext;

    public UserModule(Context context) {
        mContext = context;
    }

//    @Provides
//    public UserService provideUserService() {
//        Log.e(TAG, "调用了provideUserService");
//        return new UserService();
//    }

    @Provides
    public UserStore provideUserStore() {
        Log.e(TAG, "调用了provideUserStore");
        return new UserStore(mContext);
    }

//    不能有多个返回同一个类型的对象的方法,其实也可以，可以用Named区分
    @Provides
    public UserService getUserService(OkHttpClient okHttpClient) {
        Log.e(TAG, "调用了getUserService");
        return new UserService(okHttpClient);
    }

//    @Provides
//    @Named("dev")
//    public UserService getUserServiceForDev(OkHttpClient okHttpClient) {
//        Log.e(TAG, "getUserServiceForDev");
//        return new UserService(okHttpClient);
//    }
//
//
//    @Provides
//    @Named("rel")
//    public UserService getUserServiceForRel(OkHttpClient okHttpClient) {
//        Log.e(TAG, "getUserServiceForRel");
//        return new UserService(okHttpClient);
//    }


    @Provides
    public String getUrl() {
        return "http://www.baidu.com";
    }

//    @Provides
//    @Singleton //单例,这是假单例，不同的component通过这个UserModule生成的对象不一样。一定要将这个Module独立出来放在一个单独的component中，然后再dependecies进来才是真正的单例。
//    public OkHttpClient getOkHttpClient(){
//        return new OkHttpClient().newBuilder().build();
//    }


    //需要UserSerivce对象作为参数，他为什么知道调用provideUserService方法呢？
    @Provides
    public UserManager provideUserManager(UserService userService, UserStore userStore) {
        Log.e(TAG, "调用了provideUserManager");
        return new UserManager(userService, userStore);
    }


}
