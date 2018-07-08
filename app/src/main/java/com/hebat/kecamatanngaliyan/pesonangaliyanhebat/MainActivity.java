package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewTematik, imageViewWisata, imageViewKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewTematik = (ImageView) findViewById(R.id.imageView_tematik);
        imageViewWisata = (ImageView) findViewById(R.id.imageView_wisata);
        imageViewKuliner = (ImageView) findViewById(R.id.imageView_kuliner);

        imageViewTematik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTematik = new Intent(MainActivity.this, TematikActivity.class);
                startActivity(intentTematik);
                finish();
            }
        });

        imageViewWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWisata = new Intent(MainActivity.this, WisataActivity.class);
                startActivity(intentWisata);
                finish();
            }
        });

        imageViewKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKuliner = new Intent(MainActivity.this, KulinerActivity.class);
                startActivity(intentKuliner);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
