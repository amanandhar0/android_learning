package com.example.aman.todo_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserdetailActivity extends AppCompatActivity {
    private EditText usernameEdittext;
    private EditText passwordEditText;
    private Button saveBttn;
    private Button editBttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdetail);
        usernameEdittext = findViewById(R.id.username_editext);
        passwordEditText = findViewById(R.id.password_editext);
        saveBttn = findViewById(R.id.saveBttn);
        editBttn = findViewById(R.id.editBttn);

        saveBttn.setOnClickListener(this);
        editBttn.setOnClickListener(this);

        saveBttn.setOnClickListener(false);
        editBttn.setOnClickListener(false);

        usernameEdittext.setText(sharedPreference.getUsername());
        passwordEditText.setText(sharedPreference.getPassword());
    }
        @Override
        public void onClick(View v){
            int id=v.getId();
            String username;
            String password;

            switch (id){
                case R.id.saveBttn;
                username=usernameEdittext.getText().toString();
                password=passwordEditText.getText().toString();

                sharedPreferences.saveUsername(username);
                sharedPreferences.savePassword(password);

                    Toast.makeText(this, "Username and password updated Successfuky ", Toast.LENGTH_SHORT).show();

                usernameEdittext.setEnabled(false);
                passwordEditText.setEnabled(false);

                break;

                case R.id.editBttn;
                usernameEdittext.setEnabled(true);
                passwordEditText.setEnabled(true);
            }
        }
    }
}
