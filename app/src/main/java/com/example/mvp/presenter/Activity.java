package com.example.mvp.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.mvp.view.mainView.ViewOfTheActivity;
import com.example.mvp.view.mainView.ViewOfTheActivityInterface;

public class Activity extends AppCompatActivity
        implements ViewOfTheActivityInterface.ClickListener {

    private ViewOfTheActivity viewOfTheActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewOfTheActivity = new ViewOfTheActivity(getLayoutInflater(), null);
        viewOfTheActivity.setListener(this);
        setContentView(viewOfTheActivity.getRootView());
    }

    @Override
    public void buttonClick() {
        Toast.makeText(this, "The Button was clicked", Toast.LENGTH_SHORT).show();
    }
}
