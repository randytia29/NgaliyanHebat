package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TematikActivity extends AppCompatActivity {

    CardView snack, bringinBerseri, souvenir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tematik);

        snack = (CardView) findViewById(R.id.kampung_snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSnack = new Intent(TematikActivity.this, SnackActivity.class);
                startActivity(intentSnack);
            }
        });

        bringinBerseri = (CardView) findViewById(R.id.kampung_bringinberseri);
        bringinBerseri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBringinBerseri = new Intent(TematikActivity.this, BringinBerseriActivity.class);
                startActivity(intentBringinBerseri);
            }
        });

        souvenir = (CardView) findViewById(R.id.kampung_souvenir);
        souvenir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSouvenir = new Intent(TematikActivity.this, SouvenirActivity.class);
                startActivity(intentSouvenir);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(TematikActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
