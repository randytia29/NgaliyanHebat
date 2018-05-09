package com.example.user.ngaliyanhebat.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.user.ngaliyanhebat.BringinBerseriActivity;
import com.example.user.ngaliyanhebat.R;
import com.example.user.ngaliyanhebat.SnackActivity;

public class FragmentTematik extends Fragment {

    CardView snack, bringinBerseri;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tematik, container, false);

        snack = (CardView) v.findViewById(R.id.kampung_snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSnack = new Intent(getActivity(), SnackActivity.class);
                startActivity(intentSnack);
            }
        });

        bringinBerseri = (CardView) v.findViewById(R.id.kampung_bringinberseri);
        bringinBerseri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBringinBerseri = new Intent(getActivity(), BringinBerseriActivity.class);
                startActivity(intentBringinBerseri);
            }
        });

        return v;
    }
}
