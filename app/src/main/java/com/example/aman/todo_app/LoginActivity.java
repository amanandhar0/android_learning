package com.example.aman.todo_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        SharedPreferences sharedPref = getSharedPreferences('@+id/username_editext',);
    }

    public void openActivity(View view) {
        @SuppressLint("WrongConstant") SharedPreferences pref = getSharedPreferences("usname", MODE_PRIVATE);
//        SharedPreferences.Editor editor=pref.edit();
        EditText uname = findViewById(R.id.username_editext);
        EditText pass = findViewById(R.id.password_editext);
        String username = uname.getText().toString();
        String password = pass.getText().toString();

        if (username.equals("amdin") && password.equals("admin")) {

            Intent intent = new Intent(LoginActivity.this, AdminActivity.class);
            startActivity(intent);

        } else {
            if (!pref.contains("username")) {
                SharedPreferences.Editor editor = pref.edit();
                editor.putString("username", username);
                editor.putString("password", password);
                editor.commit();
                Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                startActivity(intent);

            } else {
                String usr = pref.getString("username", "");
                String pss = pref.getString("password", "");
                if (username.equals(usr) && password.equals(pss)) {
                    Intent intent = new Intent(LoginActivity.this, DashboardActivity.class);
                    startActivity(intent);
                }else{

                }
            }
//        editor.putString("android:username",username);
//        editor.putString("android:password",password);
//        editor.commit();
//
        }

    }
}