package com.example.aman.todo_app;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Aman on 24/12/2018.
 */

public class DashboardActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        @SuppressLint("WrongConstant")SharedPreferences pref=getSharedPreferences("usname",MODE_PRIVATE);
        String username=pref.getString("android:username","");
        String password=pref.getString("android:password","");
        TextView displayusername=findViewById(R.id.disuname);
        displayusername.setText(username);
        TextView displaypassword=findViewById(R.id.dispassword);
        displaypassword.setText(password);
    }
}
