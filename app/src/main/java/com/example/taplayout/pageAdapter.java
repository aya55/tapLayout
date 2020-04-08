package com.example.taplayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class pageAdapter extends FragmentStatePagerAdapter {
    int counter;
    public pageAdapter(@NonNull FragmentManager fm, int counter) {
        super(fm);
        this.counter= counter;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                tab1 tab1 = new tab1();
                return tab1;
            case 1:
                tab2 tab2 = new tab2();
                return tab2;
            case 2:
                tab3 tab3 = new tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return counter;
    }
}
