package com.example.dagger2example;

import com.example.dagger2example.annimation.ActivityScope;

import dagger.Component;

//@Component(modules = {UserModule.class})
@ActivityScope
@Component(modules = UserModule.class, dependencies = HttpComponent.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);
}
