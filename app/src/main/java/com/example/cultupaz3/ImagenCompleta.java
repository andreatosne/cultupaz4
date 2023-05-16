package com.example.cultupaz3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cultupaz3.adaptador.GaleriaArtes;

public class ImagenCompleta extends AppCompatActivity {

    ImageView imageView;
    GaleriaArtes galeriaArtes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagen_completa);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        imageView = (ImageView)findViewById(R.id.iv_logo);

        ActionBar actionBar = getSupportActionBar();
        ((ActionBar) actionBar).setTitle("Foto completa");

        Intent intent = getIntent();
        int posicion = ((Intent) intent).getExtras().getInt( "misImagenes");

        galeriaArtes = new GaleriaArtes(this);
        imageView.setImageResource((galeriaArtes.imageArray[posicion]));




    }
}