package com.example.a127107.p10_knownothing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import r21nomi.com.glrippleview.GLRippleView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {
    GLRippleView gllol;



    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);
        gllol = (GLRippleView)view.findViewById(R.id.rippleView);
        gllol.setRippleOffset(0.01f);
        return view;
    }

}
