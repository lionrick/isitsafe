package com.example.isitsafe;

public class KeyGuardian1 {

    private final static String APP_KEY = "iamapikey";
    private final static String APP_SECRET = "iamapisecret";

    public static String getApiKey() {
        return APP_KEY;
    }

    public static String getApiSecret() {
        return APP_SECRET;
    }




}
