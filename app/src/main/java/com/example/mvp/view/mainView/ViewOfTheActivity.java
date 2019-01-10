package com.example.mvp.view.mainView;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mvp.R;
import com.example.mvp.view.BaseView;

public class ViewOfTheActivity implements ViewOfTheActivityInterface {

    private View rootView;
    Button button;
    private ClickListener listener;

    public ViewOfTheActivity(LayoutInflater inflater, ViewGroup viewGroup){
        rootView = inflater.inflate(R.layout.activity_view, viewGroup, false);

        button = rootView.findViewById(R.id.button);
        button.setOnClickListener(view -> {
            if (listener != null) {
                listener.buttonClick();
            }
        });
    }


    @Override
    public View getRootView() {
        return rootView;
    }

    @Override
    public Bundle getViewState() {
        return null;
    }

    @Override
    public void setListener(ClickListener clickListener) {
        listener = clickListener;
    }
}
