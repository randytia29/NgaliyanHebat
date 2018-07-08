package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class BahalianActivity extends AppCompatActivity {

    FloatingActionButton fab_plus, fabBahalianMap, fab_info;
    Animation fabOpen, fabClose, fabRClockwise, fabRAnticlockwise, fabOpen2, fabClose2;
    boolean isOpen = false;
    Dialog myDialog;
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bahalian);

        fab_plus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fab_info = (FloatingActionButton) findViewById(R.id.fab_info_taman_lele);
        fabBahalianMap = (FloatingActionButton) findViewById(R.id.fab_bahalian_map);

        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open3);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close3);
        fabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        fabRAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);
        fabOpen2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open4);
        fabClose2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close4);

        fabBahalianMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("http://plus.codes/6P5G282V+VCH");
                Intent bahalianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                bahalianIntent.setPackage("com.google.android.apps.maps");
                startActivity(bahalianIntent);
            }
        });

        fab_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isOpen) {
                    fab_info.startAnimation(fabClose2);
                    fabBahalianMap.startAnimation(fabClose2);
                    fab_plus.startAnimation(fabRAnticlockwise);
                    fab_info.setClickable(false);
                    fabBahalianMap.setClickable(false);
                    isOpen = false;
                } else {
                    fab_info.startAnimation(fabOpen);
                    fabBahalianMap.startAnimation(fabOpen2);
                    fab_plus.startAnimation(fabRClockwise);
                    fab_info.setClickable(true);
                    fabBahalianMap.setClickable(true);
                    isOpen = true;
                }
            }
        });

        fab_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(BahalianActivity.this);
        myDialog.setContentView(R.layout.dialog_info_taman_lele);
        myDialog.setTitle("My Custom Dialog");

        keluar = (Button) myDialog.findViewById(R.id.keluar);

        keluar.setEnabled(true);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
    }
}
