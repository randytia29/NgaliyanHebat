package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TamanLeleActivity extends AppCompatActivity {

    FloatingActionButton fabTamanLeleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taman_lele);

        fabTamanLeleMap = (FloatingActionButton) findViewById(R.id.fab_taman_lele_map);
        fabTamanLeleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Kampoeng Wisata Taman Lele");
                Intent tamanLeleIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                tamanLeleIntent.setPackage("com.google.android.apps.maps");
                startActivity(tamanLeleIntent);
            }
        });
    }
}
