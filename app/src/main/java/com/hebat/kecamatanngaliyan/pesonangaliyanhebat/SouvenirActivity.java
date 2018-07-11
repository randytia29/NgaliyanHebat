package com.hebat.kecamatanngaliyan.pesonangaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SouvenirActivity extends AppCompatActivity {

    FloatingActionButton fabSouvenirMap;
    TextView textViewSouvenirContact1, textViewSouvenirContact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        textViewSouvenirContact1 = (TextView) findViewById(R.id.textview_souvenir_contact1);
        textViewSouvenirContact1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "08156660851", null));
                startActivity(intent);
            }
        });

        textViewSouvenirContact2 = (TextView) findViewById(R.id.textview_souvenir_contact2);
        textViewSouvenirContact2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085950720860", null));
                startActivity(intent);
            }
        });

        fabSouvenirMap = (FloatingActionButton) findViewById(R.id.fab_souvenir_map);
        fabSouvenirMap.setOnClickListener(new View.OnClickListener() {
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
                    collapsingToolbar.setTitle("Kampung Souvenir");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }
}
