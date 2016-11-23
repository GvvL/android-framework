package com.neili.example;



import android.support.v4.view.ViewPager;

import com.neili.framework.R;
import com.neili.framework.ViewDelegate;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/**
 * Created by Administrator on 2016/11/23.
 */
public class TablayoutViewDelegate extends ViewDelegate{
    ViewPager viewPager;
    SmartTabLayout smartTabLayout;
    @Override
    public int getRootLayoutId() {
        return R.layout.act_tablayout;
    }

    @Override
    public void initWidget() {
        super.initWidget();
        viewPager=this.get(R.id.viewpager);
        smartTabLayout=this.get(R.id.tablayout);
    }
}
