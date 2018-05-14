package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.ngaliyanhebat.Fragment.FragmentTematik;

public class SnackActivity extends AppCompatActivity {

    FloatingActionButton fabSnackContact;
    TextView telpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        fabSnackContact = (FloatingActionButton) findViewById(R.id.fab_snack_contact);
        fabSnackContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "089697177144", null));
                startActivity(intent);
            }
        });
    }
}