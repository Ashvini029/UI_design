package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class edithome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edithome);
    }
    public void GoToProfile(View view){
        Intent intent = new Intent(edithome.this,myprofile.class);
        startActivity(intent);

    }
}
