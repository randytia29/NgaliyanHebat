package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SouvenirActivity extends AppCompatActivity {

    FloatingActionButton fabSouvenirContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souvenir);

        fabSouvenirContact = (FloatingActionButton) findViewById(R.id.fab_souvenir_contact);
        fabSouvenirContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "08156660851", null));
                startActivity(intent);
            }
        });
    }
}
