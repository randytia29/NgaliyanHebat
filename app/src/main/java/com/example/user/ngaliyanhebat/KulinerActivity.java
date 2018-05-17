package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class KulinerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
    }

    @Override
    public void onBackPressed() {
        Intent intentBack = new Intent(KulinerActivity.this, MainActivity.class);
        startActivity(intentBack);
        finish();
    }
}
