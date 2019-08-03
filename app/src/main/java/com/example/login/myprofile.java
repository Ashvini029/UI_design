package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class myprofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);
    }

    public void EditHome(View view) {
        Intent intent = new Intent(myprofile.this, edithome.class);
        startActivity(intent);

    }
    public void EditDetails(View view){
        Intent intent = new Intent(myprofile.this,editdetails.class);
        startActivity(intent);

    }
    public void GoToMyFeed(View view){
        Intent intent = new Intent(myprofile.this,feed.class);
        startActivity(intent);

    }
}