package com.example.welook.slideapp_pidgy;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

/**
 * Created by Welook on 1/20/2017.
 */

public class Dashboard extends FragmentActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

            SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
            viewPager.setAdapter(swipeAdapter);

    }
}

