package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Binder;
import android.os.Bundle;

import com.example.fragmenttest.ui.main.MainFragment;
import com.example.fragmenttest.ui.main.SettingsFragment;

public class MainActivity extends FragmentActivity {
    private static final int NUM_PAGES=2;
    private ViewPager2 viewPager;
    private FragmentStateAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
/*        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        } */
    }

    private class ScreenSlidePagerAdapter extends FragmentStateAdapter{
        public ScreenSlidePagerAdapter(FragmentActivity fa){
            super(fa);
        }

        @Override
        public Fragment createFragment(int position){
            switch (position){
                case 0:
                    return new MainFragment();
                case 1:
                    return new SettingsFragment();
            }
            return new MainFragment();
        }

        @Override
        public int getItemCount(){
            return NUM_PAGES;
        }
    }
}