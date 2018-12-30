package com.example.mvp.view.mainView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mvp.R;
import com.example.mvp.view.BaseView;

public class MainView implements BaseView {

    private View rootView;

    public MainView(LayoutInflater inflater, ViewGroup viewGroup){
        rootView = inflater.inflate(R.layout.activity_main, viewGroup, false);
    }


    @Override
    public View getRootView() {
        return rootView;
    }

    @Override
    public Bundle getViewState() {
        return null;
    }
}
