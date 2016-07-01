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
public class YoteSinFragment extends Fragment {


    public static YoteSinFragment newInstance() {
        return new YoteSinFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_yote_sin, container, false);

        Button btnDetails = (Button) view.findViewById(R.id.btn_details);
        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Details clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnShare = (Button) view.findViewById(R.id.btn_share);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Share clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnReadMore = (Button) view.findViewById(R.id.btn_read_more);
        btnReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Read more clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
