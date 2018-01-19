package com.hengo.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by Hengo.
 * 2018/1/19 16:04
 */
public class JsonUtil {
    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
