package com.richer.helpers.Adapter;

import com.richer.helpers.ui.home.HomeFragment;
import com.richer.helpers.ui.mine.MyHistoryFragment;

import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyHistoryFragmentAdapter extends FragmentStatePagerAdapter {

    private List<MyHistoryFragment> fragmentList;

    public MyHistoryFragmentAdapter(FragmentManager fm, List<MyHistoryFragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentList.get(position).getTitle();
    }
}
