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
public class PulseFragment extends Fragment {

    public static PulseFragment newInstance() {
        return new PulseFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pulse, container, false);

        Button btnSettings = (Button) view.findViewById(R.id.btn_settings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Settings clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnSearch = (Button) view.findViewById(R.id.btn_search);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Search clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnProfile = (Button) view.findViewById(R.id.btn_profile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Profile clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnCircle = (Button) view.findViewById(R.id.btn_circle);
        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Circle clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
