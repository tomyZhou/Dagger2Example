package com.example.dagger2example;

import android.content.Context;
import android.util.Log;


public class UserStore {
    private static final String TAG = UserStore.class.getSimpleName();

    private Context mContext;

    public UserStore(Context context) {
        mContext = context;
    }

    public void register() {
        Log.e(TAG, "UserStore register");
    }

}
