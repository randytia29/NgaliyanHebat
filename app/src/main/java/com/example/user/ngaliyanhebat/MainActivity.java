package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_tematik, fab_wisata, fab_kuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_tematik = (FloatingActionButton) findViewById(R.id.fab_tematik);
        fab_wisata = (FloatingActionButton) findViewById(R.id.fab_wisata);
        fab_kuliner = (FloatingActionButton) findViewById(R.id.fab_kuliner);

        fab_tematik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTematik = new Intent(MainActivity.this, TematikActivity.class);
                startActivity(intentTematik);
                finish();
            }
        });

        fab_wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWisata = new Intent(MainActivity.this, WisataActivity.class);
                startActivity(intentWisata);
                finish();
            }
        });

        fab_kuliner.setOnClickListener(new View.OnClickListener() {
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
