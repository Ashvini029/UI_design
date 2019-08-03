package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class editdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editdetails);
    }
    public void GoToProfile(View view){
        Intent intent = new Intent(editdetails.this,myprofile.class);
        startActivity(intent);

    }
}
