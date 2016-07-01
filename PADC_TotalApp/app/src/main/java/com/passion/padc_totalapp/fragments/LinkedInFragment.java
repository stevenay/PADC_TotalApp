package com.passion.padc_totalapp.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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



        return view;
    }
}
