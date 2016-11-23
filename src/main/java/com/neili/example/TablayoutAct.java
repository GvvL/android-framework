package com.neili.example;




import com.neili.framework.ActP;
import com.neili.framework.R;
import com.ogaclejapan.smarttablayout.utils.v4.Bundler;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

/**
 * Created by Administrator on 2016/11/22.
 */
public class TablayoutAct extends ActP<TablayoutViewDelegate> {
    FragmentPagerItemAdapter adapter;

    @Override
    protected void preliminary() {
        super.preliminary();
        FragmentPagerItems fragmentPagerItems=FragmentPagerItems.with(this)
                .add("第一页", TablayoutFrg.class, new Bundler().putString("title","第一个").get())
                .add("第二页", TablayoutFrg.class,new Bundler().putString("title","第二个").get())
                .create();
        adapter=new FragmentPagerItemAdapter(getSupportFragmentManager(),fragmentPagerItems);
        viewDelegate.viewPager.setAdapter(adapter);
        viewDelegate.smartTabLayout.setViewPager(viewDelegate.viewPager);
    }




}
