package com.example.user.ngaliyanhebat;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SnackActivity extends AppCompatActivity {

    FloatingActionButton fabSnackContact;
    Dialog myDialog;
    Button simpan, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        fabSnackContact = (FloatingActionButton) findViewById(R.id.fab_snack_contact);
        fabSnackContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyCustomAlertDialog();
            }
        });
    }

    public void MyCustomAlertDialog() {
        myDialog = new Dialog(SnackActivity.this);
        myDialog.setContentView(R.layout.dialog_contact_snack);
        myDialog.setTitle("My Custom Dialog");

        simpan = (Button) myDialog.findViewById(R.id.simpan);
        keluar = (Button) myDialog.findViewById(R.id.keluar);

        simpan.setEnabled(true);
        keluar.setEnabled(true);

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "089697177144", null));
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
