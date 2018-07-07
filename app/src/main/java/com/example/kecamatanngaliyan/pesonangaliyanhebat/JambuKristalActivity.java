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

public class JambuKristalActivity extends AppCompatActivity {

    FloatingActionButton fabJambuKrisContact;
    Dialog myDialog;
    Button simpan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jambu_kristal);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initCollapsingToolbar();

        fabJambuKrisContact = (FloatingActionButton) findViewById(R.id.fab_jambukris_contact);
        fabJambuKrisContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(JambuKristalActivity.this);
        myDialog.setContentView(R.layout.dialog_contact_jambukris);
        myDialog.setTitle("My Custom Dialog");

        simpan = (Button) myDialog.findViewById(R.id.simpan);
        keluar = (Button) myDialog.findViewById(R.id.keluar);

        simpan.setEnabled(true);
        keluar.setEnabled(true);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "081901085472", null));
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
                    collapsingToolbar.setTitle("Kampung Jambu Kristal");
                    isShow = true;
                } else if (isShow) {
                    collapsingToolbar.setTitle(" ");
                    isShow = false;
                }
            }
        });
    }
}