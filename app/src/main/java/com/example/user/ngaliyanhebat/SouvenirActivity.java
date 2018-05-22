package com.example.user.ngaliyanhebat;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SouvenirActivity extends AppCompatActivity {

    FloatingActionButton fabSouvenirContact;
    Dialog myDialog;
    Button simpan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        fabSouvenirContact = (FloatingActionButton) findViewById(R.id.fab_souvenir_contact);
        fabSouvenirContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(SouvenirActivity.this);
        myDialog.setContentView(R.layout.dialog_contact_souvenir);
        myDialog.setTitle("My Custom Dialog");

        simpan = (Button) myDialog.findViewById(R.id.simpan);
        keluar = (Button) myDialog.findViewById(R.id.keluar);

        simpan.setEnabled(true);
        keluar.setEnabled(true);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "08156660851", null));
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
}
