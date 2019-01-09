package com.example.mvp.view.mainView;

import com.example.mvp.view.BaseView;

public interface ViewOfTheActivityInterface extends BaseView {

    interface ClickListener {
        void ButtonClick();
    }

    void setListener(ClickListener clickListener);
}
