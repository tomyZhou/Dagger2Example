package com.example.dagger2example;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final boolean IS_DEBUG = true;

//    @Named("dev")
//    @Inject
//    UserService mUserServiceDev;
//
//    @Named("rel")
//    @Inject
//    UserService mUserServiceRel;

    @Inject
    UserManager mUserManger;

//    @Inject
//    OkHttpClient okHttpClient1;
//
//    @Inject
//    OkHttpClient okHttpClient2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(MainActivity.this,LoginActivity.class));

//        自己创建实例，依赖
//        mUserService = new UserService();
//        mUserService.register();

//        DaggerUserComponent.create().inject(this);
//        mUserService.register();

//        DaggerUserComponent.builder().userModule(new UserModule(this)).build().inject(this);
//
//        mUserManger.register();

//        if (IS_DEBUG) {
//            mUserServiceDev.register();
//        } else {
//            mUserServiceRel.register();
//        }

//        Log.e("xx", okHttpClient1 + ":" + okHttpClient2);

        DaggerUserComponent.builder()
                .userModule(new UserModule(this))
                .httpComponent(((MyAppliccatioin) getApplication()).getHttpComponent())
                .build()
                .inject(this);

        mUserManger.register();
    }
}
