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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class LembahKalipancurActivity extends AppCompatActivity {

    FloatingActionButton fabLembahKalipancurMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembah_kalipancur);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        fabLembahKalipancurMap = (FloatingActionButton) findViewById(R.id.fab_lembahklp_map);
        fabLembahKalipancurMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Desa Wisata Lembah Kalipancur");
                Intent lembahKalipancurIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                lembahKalipancurIntent.setPackage("com.google.android.apps.maps");
                startActivity(lembahKalipancurIntent);
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
                    collapsingToolbar.setTitle("Lembah Kalipancur");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }
}

                /*Uri gmmIntentUri = Uri.parse("http://plus.codes/6P4GX8XV+PP");
                Intent lembahKalipancurIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                lembahKalipancurIntent.setPackage("com.google.android.apps.maps");
                startActivity(lembahKalipancurIntent);*/