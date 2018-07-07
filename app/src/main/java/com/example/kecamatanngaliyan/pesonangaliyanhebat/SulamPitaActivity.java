package com.example.kecamatanngaliyan.pesonangaliyanhebat;

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

    FloatingActionButton fabSnackContact;
    Dialog myDialog;
    TextView simpanSulamPita, simpanRajutMacrame;
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulam_pita);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        fabSnackContact = (FloatingActionButton) findViewById(R.id.fab_sulampita_contact);
        fabSnackContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(SulamPitaActivity.this);
        myDialog.setContentView(R.layout.dialog_contact_sulampita);
        myDialog.setTitle("My Custom Dialog");

        simpanSulamPita = (TextView) myDialog.findViewById(R.id.simpansulampita);
        simpanRajutMacrame = (TextView) myDialog.findViewById(R.id.simpanrajutmacrame);
        keluar = (Button) myDialog.findViewById(R.id.keluar);

        simpanSulamPita.setEnabled(true);
        simpanRajutMacrame.setEnabled(true);
        keluar.setEnabled(true);

        simpanSulamPita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "085225148150", null));
                startActivity(intent);
                myDialog.dismiss();
            }
        });

        simpanRajutMacrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081326494187", null));
                startActivity(intent);
                myDialog.dismiss();
            }
        });

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        myDialog.show();
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