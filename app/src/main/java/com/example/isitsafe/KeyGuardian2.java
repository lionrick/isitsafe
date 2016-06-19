package com.example.isitsafe;

import android.content.Context;

public class KeyGuardian2 {

    public static String getApiKey(Context context) {
        return context.getString(R.string.api_key);
    }

    public static String getApiSecret(Context context) {
        return context.getString(R.string.api_secret);
    }




}
