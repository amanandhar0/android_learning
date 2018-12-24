package com.example.aman.todo_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        },3000);
    }
    public void openActivity(View view){
        System.out.println("Button Clicked");


        Intent intent=new Intent(this,LoginActivity.class);
        StartActivity(intent);
    }

    private void StartActivity(Intent intent) {



//        new Handler().postDelayed(new Runnable(){
//            @Override
//            public void run(){
//                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
//                MainActivity.this.startActivity(intent);
//                MainActivity.this.finish();
//            }
//        },5000);
    }
}
