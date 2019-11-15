package com.richer.helpers.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.richer.helpers.Adapter.HomeFragmentAdapter;
import com.richer.helpers.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private PagerAdapter mPagerAdapter;
    private List<HomeFragment> fragments;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        mTabLayout = view.findViewById(R.id.tablayout_home);
        mViewPager = view.findViewById(R.id.viewpager_home);

        fragments = new ArrayList<>();

        fragments.add(new TaskFragment());
        fragments.add(new TransFragment());
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("发现");
        initViewPagerFragment();
        return view;
    }

    private void initViewPagerFragment(){

        mPagerAdapter = new HomeFragmentAdapter(getActivity().getSupportFragmentManager(),fragments);
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

    }

    public String getTitle(){
        return null;
    }

}