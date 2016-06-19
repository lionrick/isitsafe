package com.example.isitsafe;

import android.content.Context;

public class KeyGuardian3 {


    static {
        System.loadLibrary("true_guardian");
    }

    public native String getApiKey();

    public native String getApiSecret();

    public String getApiKeyFromNative() {
        return getApiKey();
    }


    public String getApiSecretFromNative(Context context) {
        return getApiSecret();
    }

}
