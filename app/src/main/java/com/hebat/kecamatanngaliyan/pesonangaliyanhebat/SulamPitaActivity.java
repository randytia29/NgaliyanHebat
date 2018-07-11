package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SulamPitaActivity extends AppCompatActivity {

    FloatingActionButton fabSulamPitaMap;
    TextView textViewSulamPitaContact1, textViewSulamPitaContact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulam_pita);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        textViewSulamPitaContact1 = (TextView) findViewById(R.id.textview_sulampita_contact1);
        textViewSulamPitaContact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085225148150", null));
                startActivity(intent);
            }
        });

        textViewSulamPitaContact2 = (TextView) findViewById(R.id.textview_sulampita_contact2);
        textViewSulamPitaContact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081326494187", null));
                startActivity(intent);
            }
        });

        fabSulamPitaMap = (FloatingActionButton) findViewById(R.id.fab_sulampita_map);
        fabSulamPitaMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P5G2965+R9G");
                Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }

    private void initCollapsingToolbar() {
        final CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(" ");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        // hiding & showing the title when toolbar expanded & collapsed
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    collapsingToolbar.setTitle("Kampung Sulam Pita");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }
}