package com.example.namp5.lesson02;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        setIconTab();
    }

    private void addControl() {
        ViewPager pager =  findViewById(R.id.view_pager);
        mTabLayout = findViewById(R.id.tab_layout);
        FragmentManager fragmentManager = getSupportFragmentManager();
        PagerAdapter adapterPage = new AdapterPage(fragmentManager);
        pager.setAdapter(adapterPage);
        mTabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setTabsFromPagerAdapter(adapterPage);
        mTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));
    }

    public void setIconTab(){
        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_backup_black_24dp);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_backup_black_24dp);
        mTabLayout.getTabAt(2).setIcon(R.drawable.ic_backup_black_24dp);
    }
}
