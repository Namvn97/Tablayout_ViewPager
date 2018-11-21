package com.example.namp5.lesson02;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by namp5 on 11/21/2018.
 */

public class AdapterPage extends FragmentStatePagerAdapter {
    private static final int NUMBER_ZERO = 0;
    private static final int NUMBER_ONE = 1;
    private static final int NUMBER_TWO = 2;
    private static final String TITLE_FIRTS = "FIRST";
    private static final String TITLE_TWO = "SECOND";
    private static final String TITLE_THIRD = "THIRD";
    private Fragment mFragment;

    public AdapterPage(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case NUMBER_ZERO :
                mFragment = new FragmentOne();
                break;
            case NUMBER_ONE :
                mFragment = new FragmentTwo();
                break;
            case NUMBER_TWO :
                mFragment = new FragmentThree();
                break;
            default:
                break;
        }
        return mFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case NUMBER_ZERO:
                title = TITLE_FIRTS;
                break;
            case NUMBER_ONE:
                title = TITLE_TWO;
                break;
            case NUMBER_TWO:
                title = TITLE_TWO;
                break;
            default:
                break;
        }
        return title;
    }
}
