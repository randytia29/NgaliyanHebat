package com.example.user.ngaliyanhebat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.user.ngaliyanhebat.Fragment.FragmentTematik;

public class SnackActivity extends AppCompatActivity {

    TextView telpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        telpon = (TextView) findViewById(R.id.telponSnack);
        telpon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "089697177144", null));
                startActivity(intent);
            }
        });
    }

}