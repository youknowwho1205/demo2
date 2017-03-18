package com.youknowwho.demo2.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.youknowwho.demo2.fragments.Fragment1;
import com.youknowwho.demo2.fragments.Fragment2;
import com.youknowwho.demo2.fragments.Fragment3;
import com.youknowwho.demo2.fragments.Fragment4;

/**
 * Created by chetan on 18/3/17.
 */

public class ScreenSlidePagerAdapter extends FragmentPagerAdapter {

    private static int NUM_ITEMS = 4;

    public ScreenSlidePagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0:
                return new Fragment1();

            case 1:
                return new Fragment2();

            case 2:
                return new Fragment3();

            case 3:
                return new Fragment4();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}
