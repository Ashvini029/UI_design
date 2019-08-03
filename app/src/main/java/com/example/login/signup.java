package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void GoToLogin(View view){
    Intent intent = new Intent(signup.this,MainActivity.class);
    startActivity(intent);}

    public void GoToHome(View view){
        Intent intent = new Intent(signup.this,home.class);
        startActivity(intent);

    }

}
