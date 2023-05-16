package com.example.cultupaz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class vistaprincipal extends AppCompatActivity {

    LinearLayout tem1,tem2,tem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistaprincipal);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        tem1=findViewById(R.id.tem1);
        tem2 = findViewById(R.id.tem2);
        tem3 =findViewById(R.id.tem3);

        tem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irsiguiente=new Intent(vistaprincipal.this,Principalblog.class);
                startActivity(irsiguiente);
            }
        });
        tem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irsiguiente=new Intent(vistaprincipal.this,Muro.class);
                startActivity(irsiguiente);
            }
        });

    }
}