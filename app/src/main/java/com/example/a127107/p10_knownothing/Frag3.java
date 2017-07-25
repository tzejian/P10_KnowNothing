package com.example.a127107.p10_knownothing;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag3 extends Fragment {
    ImageView iv;



    public Frag3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag3, container, false);
        iv = (ImageView)view.findViewById(R.id.iv);
        String imageUrl = "http://square.github.io/picasso/static/sample.png";
        Picasso.with(getActivity()).load(imageUrl).into(iv);
        return view;
    }

}
