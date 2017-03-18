package com.youknowwho.demo2.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.youknowwho.demo2.R;

/**
 * Created by chetan on 18/3/17.
 */

public class Fragment1 extends BaseFragment {

    private LinearLayout parentLay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_1, container, false);

        initViewComponents(view);


        return view;
    }

    private void initViewComponents(View view) {

        parentLay = (LinearLayout)view.findViewById(R.id.parent_lay);
        parentLay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(new AlphaAnimation(1f, 0.5f));
                Toast.makeText(getActivity(), "Fragment 1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
