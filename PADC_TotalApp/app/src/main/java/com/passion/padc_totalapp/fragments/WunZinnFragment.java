package com.passion.padc_totalapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.passion.padc_totalapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WunZinnFragment extends Fragment {

    public static WunZinnFragment newInstance() {
        return new WunZinnFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_wun_zinn, container, false);

        Button btnBuy = (Button) view.findViewById(R.id.btn_buy);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Buy clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnReadSample = (Button) view.findViewById(R.id.btn_read_sample);
        btnReadSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Sample clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
