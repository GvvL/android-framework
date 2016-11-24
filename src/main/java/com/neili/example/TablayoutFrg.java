package com.neili.example;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.api.attributes.BootstrapBrand;
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
        new BootstrapBrand(){

            @Override
            public int defaultFill(Context context) {
                return 0;
            }

            @Override
            public int defaultEdge(Context context) {
                return 0;
            }

            @Override
            public int defaultTextColor(Context context) {
                return 0;
            }

            @Override
            public int activeFill(Context context) {
                return 0;
            }

            @Override
            public int activeEdge(Context context) {
                return 0;
            }

            @Override
            public int activeTextColor(Context context) {
                return 0;
            }

            @Override
            public int disabledFill(Context context) {
                return 0;
            }

            @Override
            public int disabledEdge(Context context) {
                return 0;
            }

            @Override
            public int disabledTextColor(Context context) {
                return 0;
            }

            @Override
            public int getColor() {
                return 0;
            }
        };
        return view;
    }
}
