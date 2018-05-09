package com.example.user.ngaliyanhebat.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.ngaliyanhebat.R;

public class FragmentWisata extends Fragment {

    CardView lembahKalipancur, tamanLele;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_wisata, container, false);

        lembahKalipancur = (CardView) v.findViewById(R.id.lembah_kalipancur);
        lembahKalipancur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Desa Wisata Lembah Kalipancur");
                Intent lembahKalipancurIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                lembahKalipancurIntent.setPackage("com.google.android.apps.maps");
                startActivity(lembahKalipancurIntent);
            }
        });

        tamanLele = (CardView) v.findViewById(R.id.taman_lele);
        tamanLele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=Kampoeng Wisata Taman Lele");
                Intent tamanLeleIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                tamanLeleIntent.setPackage("com.google.android.apps.maps");
                startActivity(tamanLeleIntent);
            }
        });
        return v;
    }
}
