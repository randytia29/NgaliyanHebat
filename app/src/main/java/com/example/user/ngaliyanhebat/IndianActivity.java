package com.example.user.ngaliyanhebat;

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

public class IndianActivity extends AppCompatActivity {

    FloatingActionButton fabIndianMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indian);

        fabIndianMap = (FloatingActionButton) findViewById(R.id.fab_indian_map);
        fabIndianMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Perum Panorama Banjaran");
                Intent indianIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                indianIntent.setPackage("com.google.android.apps.maps");
                startActivity(indianIntent);
            }
        });
    }
}

