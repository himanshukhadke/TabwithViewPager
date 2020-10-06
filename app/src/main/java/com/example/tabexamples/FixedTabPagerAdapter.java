package com.example.tabexamples;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "NOTICE";
        } else if (position == 1) {
            return "NEWS";
        } else {
            return "ALUMNI";
        }
    }

    @Override

    public Fragment getItem(int position) {
        if (position == 0) {

            return new Notice();
        } else if (position == 1) {
            return new News();
        } else {
            return new Alumni();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}