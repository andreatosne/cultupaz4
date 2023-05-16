package com.example.cultupaz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principalblog extends AppCompatActivity {

    TextView culturaypaz;
    TextView  LGBTIQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principalblog);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        LGBTIQ =  findViewById(R.id.LGTBIQ);

        culturaypaz  = findViewById(R.id.culturaypaz);

        culturaypaz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent irsiguiente = new Intent(Principalblog.this,Blog.class);
                startActivity(irsiguiente);

            }
        });


        LGBTIQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irlgtiq = new Intent(Principalblog.this,lgtbiq_informacion.class);
                startActivity(irlgtiq);
            }
        });
    }
}