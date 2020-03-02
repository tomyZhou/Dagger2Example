package com.example.dagger2example;

public class UserManager {

    private UserStore mUserStore;
    private UserService mUserService;

    public UserManager(UserService userService, UserStore userStore) {
        mUserService = userService;
        mUserStore = userStore;
    }

    public void register() {
        mUserService.register();
        mUserStore.register();
    }

    public void login() {
        mUserService.login();
    }


}
