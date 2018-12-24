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
    public void openActivity(View view){
        @SuppressLint("WrongConstant") SharedPreferences pref=getSharedPreferences("usname",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        EditText uname=findViewById(R.id.username_editext);
        EditText password=findViewById(R.id.password_editext);
        String username=uname.getText().toString();
        String pass=password.getText().toString();
        editor.putString("android:username",username);
        editor.putString("android:password",pass);
        editor.commit();
        Intent intent=new Intent(this,DashboardActivity.class);
        startActivity(intent);
    }

}
