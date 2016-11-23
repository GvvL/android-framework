package com.neili.example;


import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.neili.framework.R;

/**
 * Created by Administrator on 2016/11/23.
 */
public class TablayoutFrg extends Fragment {
    public static int i=1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=View.inflate(getActivity(), R.layout.frg_tablayout,null);
        TextView tv= (TextView) view.findViewById(R.id.textView);

        tv.setText(getArguments().getString("title","aa"));
        return view;
    }
}
