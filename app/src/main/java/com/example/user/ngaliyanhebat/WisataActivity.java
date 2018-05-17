package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.joooonho.SelectableRoundedImageView;

public class WisataActivity extends AppCompatActivity {

    SelectableRoundedImageView tamanlele, lembahKlp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        tamanlele = (SelectableRoundedImageView) findViewById(R.id.tamanlele);
        tamanlele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTamanLele = new Intent(WisataActivity.this, TamanLeleActivity.class);
                startActivity(intentTamanLele);
            }
        });

        lembahKlp = (SelectableRoundedImageView) findViewById(R.id.lembahklp);
        lembahKlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLembahKlp = new Intent(WisataActivity.this, LembahKalipancurActivity.class);
                startActivity(intentLembahKlp);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(WisataActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
