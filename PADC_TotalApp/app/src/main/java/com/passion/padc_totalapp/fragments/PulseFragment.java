package com.passion.padc_totalapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_pulse, container, false);
    }

}
