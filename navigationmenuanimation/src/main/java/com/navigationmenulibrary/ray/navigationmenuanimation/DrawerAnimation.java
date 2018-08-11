package com.navigationmenulibrary.ray.navigationmenuanimation;

import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.RelativeLayout;

public class DrawerAnimation {

    private  float END_SCALE = 0.7f;
    private DrawerLayout drawerLayout;
    private View rootView;
    private View content_main;

    public DrawerAnimation(DrawerLayout drawerLayout, View rootView,View content_main) {
        this.drawerLayout = drawerLayout;
        this.rootView = rootView;
        this.content_main = content_main;

    }

    public DrawerAnimation(DrawerLayout drawerLayout,View rootView, RelativeLayout content_main, float END_SCALE){
        this.drawerLayout = drawerLayout;
        this.rootView = rootView;
        this.content_main = content_main;
        this.END_SCALE = END_SCALE;
    }

    public void startAnimation(){

        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                rootView.setScaleX(offsetScale);
                rootView.setScaleY(offsetScale);

                //Translating the view

                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = content_main.getWidth() * diffScaledOffset / 2;
                final float xTranslationX = xOffset - xOffsetDiff;
                rootView.setTranslationX(xTranslationX);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerStateChanged(int newState) {
                super.onDrawerStateChanged(newState);
            }
        });
    }


    public void disableNavigationViewScroll(NavigationView navigationView){
        if(navigationView!=null){
            NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
            if(navigationMenuView!=null){
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }

}
