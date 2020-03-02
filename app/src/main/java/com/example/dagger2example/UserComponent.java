package com.example.dagger2example;

import com.example.dagger2example.annimation.ActivityScope;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Component(modules = {UserModule.class}) 注解实现Component和Module关联
 * <p>
 * Component和MainActivity关联手动实现
 *
 * @author zhoguang@unipus.cn
 * @date 2020/3/2 16:46
 */

//@Singleton
//@Component(modules = {UserModule.class})
//@Component(modules = {UserModule.class, HttpModule.class})
//@Component(modules = {UserModule.class}, dependencies = HttpComponent.class)  //这种方式不起作用

@ActivityScope
@Component(modules = {UserModule.class}, dependencies = HttpComponent.class)
public interface UserComponent {
    void inject(MainActivity activity);
}
