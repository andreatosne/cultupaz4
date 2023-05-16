package com.example.cultupaz3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.ImageView;

public class vistaprincipal extends AppCompatActivity {

    ImageView inforcraft;

    ImageView postmuro;

    ImageView artesan;

=======
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class vistaprincipal extends AppCompatActivity {

    LinearLayout tem1,tem2,tem3;
>>>>>>> ed65b2caedc5293778a82a81b7db0e43556b5a45
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistaprincipal);

<<<<<<< HEAD


=======
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
>>>>>>> ed65b2caedc5293778a82a81b7db0e43556b5a45

    }
}