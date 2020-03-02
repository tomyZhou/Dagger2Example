package com.example.dagger2example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {


    @Inject
    UserManager mUserManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DaggerLoginComponent.builder()
                .userModule(new UserModule(this))
                .httpComponent(((MyAppliccatioin) getApplication()).getHttpComponent())
                .build()
                .inject(this);

        mUserManager.login();

    }
}
