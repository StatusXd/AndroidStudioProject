package com.example.androidstudioproject.Data.DataSources;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesDataSource {
    private String SHARED_PREFERENCES_TITLE = "com.example.myapp.PREFERENCE_FILE_KEY";
    private String KEY = "FLIGHT";
    private final SharedPreferences sharePref;

    public SharedPreferencesDataSource(Context context){
        sharePref = context.getSharedPreferences(SHARED_PREFERENCES_TITLE, Context.MODE_PRIVATE);
    }

    public void SavePref(String track){
        SharedPreferences.Editor editor = sharePref.edit();
        editor.putString(KEY, track);
        editor.apply();
    }

    public void getPref(String track){
        sharePref.getString(KEY, track);
    }
}
