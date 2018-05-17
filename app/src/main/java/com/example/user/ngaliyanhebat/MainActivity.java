package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_plus, fab_tematik, fab_wisata, fab_kuliner;
    Animation fabOpen, fabClose, fabRClockwise, fabRAnticlockwise, fabOpen2, fabOpen3, fabClose2, fabClose3;
    boolean isOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_plus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fab_tematik = (FloatingActionButton) findViewById(R.id.fab_tematik);
        fab_wisata = (FloatingActionButton) findViewById(R.id.fab_wisata);
        fab_kuliner = (FloatingActionButton) findViewById(R.id.fab_kuliner);

        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        fabRAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
        fabOpen2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open2);
        fabOpen3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open3);
        fabClose2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close2);
        fabClose3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close3);

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOpen) {
                    fab_tematik.startAnimation(fabClose3);
                    fab_wisata.startAnimation(fabClose2);
                    fab_kuliner.startAnimation(fabClose);
                    fab_plus.startAnimation(fabRAnticlockwise);
                    fab_tematik.setClickable(false);
                    fab_wisata.setClickable(false);
                    fab_kuliner.setClickable(false);
                    isOpen = false;
                } else {
                    fab_tematik.startAnimation(fabOpen);
                    fab_wisata.startAnimation(fabOpen2);
                    fab_kuliner.startAnimation(fabOpen3);
                    fab_plus.startAnimation(fabRClockwise);
                    fab_tematik.setClickable(true);
                    fab_wisata.setClickable(true);
                    fab_kuliner.setClickable(true);
                    isOpen = true;
                }
            }
        });

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
