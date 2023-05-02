package com.example.cultupaz3.adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.example.cultupaz3.R;

public class GaleriaArtes extends BaseAdapter {
    private Context mContext;

    //Variable publica para las imagenes
    public int[] imageArray = {
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong,
            R.drawable.logong
    };

    public GaleriaArtes(Context mContext) {
        this.mContext = mContext;

    }


    @Override
    public int getCount() {
        return imageArray.length; //Retorna el array de la lista de imagenes
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position]; //Retorna la posicion de del array
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Aqui decimos que muestre las imagenes...
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        imageView.setLayoutParams(new Gallery.LayoutParams(340,350) );
        return (imageView);
    };
}
