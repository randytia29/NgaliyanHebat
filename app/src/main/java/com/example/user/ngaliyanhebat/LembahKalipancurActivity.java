package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LembahKalipancurActivity extends AppCompatActivity {

    FloatingActionButton fabLembahKalipancur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembah_kalipancur);

        fabLembahKalipancur = (FloatingActionButton) findViewById(R.id.fab_lembah_kalipancur);
        fabLembahKalipancur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Desa Wisata Lembah Kalipancur");
                Intent lembahKalipancurIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                lembahKalipancurIntent.setPackage("com.google.android.apps.maps");
                startActivity(lembahKalipancurIntent);
            }
        });
    }
}
