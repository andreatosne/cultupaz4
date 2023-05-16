package com.example.cultupaz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newmensaje extends AppCompatActivity {
Button characterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newmensaje);
        characterButton= findViewById(R.id.characterButton);

        characterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irsiguiente=new Intent(newmensaje.this,Muro.class);
                startActivity(irsiguiente);
            }
        });
    }
}