package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class TematikActivity extends AppCompatActivity {

    CardView snack, bringinBerseri, souvenir, jambuKris, ceriping, sulamPita;

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

        jambuKris = (CardView) findViewById(R.id.kampung_jambu_kristal);
        jambuKris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentJambuKris = new Intent(TematikActivity.this, JambuKristalActivity.class);
                startActivity(intentJambuKris);
            }
        });

        ceriping = (CardView) findViewById(R.id.kampung_criping);
        ceriping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCeriping = new Intent(TematikActivity.this, CeripingActivity.class);
                startActivity(intentCeriping);
            }
        });

        sulamPita = (CardView) findViewById(R.id.kampung_sulampita);
        sulamPita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSulamPita = new Intent(TematikActivity.this, SulamPitaActivity.class);
                startActivity(intentSulamPita);
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
