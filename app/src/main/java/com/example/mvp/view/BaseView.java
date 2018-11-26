package com.example.mvp.view;

import android.os.Bundle;
import android.view.View;

public interface BaseView {

    View getRootView();

    Bundle getViewState();
}
