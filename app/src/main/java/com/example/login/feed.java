package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class feed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);


        TextView T = findViewById(R.id.com1);

        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(feed.this,pop.class));
            }
        });
    }
    public void GoToMyProfile(View view){
        Intent intent = new Intent(feed.this,myprofile.class);
        startActivity(intent);

    }
    public void addPost(View view){
        Intent intent = new Intent(feed.this,addPost.class);
        startActivity(intent);

    }
}