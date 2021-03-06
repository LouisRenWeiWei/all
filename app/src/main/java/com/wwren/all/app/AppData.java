package com.wwren.all.app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by 任伟伟
 * Datetime: 2016/10/26-16:27
 * Email: renweiwei@ufashion.com
 */

public class AppData {
    private static SharedPreferences sharedPreferences;
    public static void init(Context context){
        sharedPreferences = context.getSharedPreferences(context.getPackageName(),Context.MODE_PRIVATE);
    }

    public static void saveString(String key,String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,value);
        editor.commit();
    }
    public static void getString(String key){
        sharedPreferences.getString(key,"");
    }

    public static void saveInt(String key,int value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(key,value);
        editor.commit();
    }
    public static void getInt(String key,int defVal){
        sharedPreferences.getInt(key,defVal);
    }
}
