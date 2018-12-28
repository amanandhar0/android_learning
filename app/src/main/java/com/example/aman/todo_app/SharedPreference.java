package com.example.aman.todo_app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Aman on 28/12/2018.
 */

public class SharedPreference {
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPreference(Context context){
        this.context=context;

        sharedPreferences=context.getSharedPreferences("LoginCredentials",Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public void saveUsernaem(String username){
        editor.putString("username",username);
        editor.commit();
    }
    public void savePassword(String password){
        editor.putString("password",password);
        editor.commit();
    }
    public String getUSername(){
        String username=sharedPreferences.getString("username","");
        return username;
    }
    public String getPassword(){
        String password=sharedPreferences.getString("password","");
        return password;
    }
}
