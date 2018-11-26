package com.example.mvp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mvp.view.mainView.MainView;

public class MainActivity extends AppCompatActivity {

    private MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainView = new MainView(getLayoutInflater(), null);
        setContentView(mainView.getRootView());
    }
}
