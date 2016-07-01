package com.passion.padc_totalapp.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.passion.padc_totalapp.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class LinkedInFragment extends Fragment {

    public static LinkedInFragment newInstance() {
        LinkedInFragment fragment = new LinkedInFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);

        ImageView iv_ProfilePicture = (ImageView) view.findViewById(R.id.iv_person_photo);
        iv_ProfilePicture.bringToFront();

        Button btnSettings = (Button) view.findViewById(R.id.btn_settings);
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Settings clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnProfileSettings = (Button) view.findViewById(R.id.btn_profile_edit);
        btnProfileSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Profile edit clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnCloseStrength = (Button) view.findViewById(R.id.btn_close_strengthen);
        btnCloseStrength.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Close strengthen clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnExperience = (Button) view.findViewById(R.id.btn_experience_edit);
        btnExperience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Experience clicked.", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
