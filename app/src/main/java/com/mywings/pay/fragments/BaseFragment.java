package com.mywings.pay.fragments;

import android.app.Fragment;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;


public abstract class BaseFragment extends Fragment {

    public static final String MESSAGE = "All fields (*) mandatory.";

    protected String getText(EditText view) {
        return view.getText().toString();
    }

    protected void show(String message, View view) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG).setAction("OK", v -> {
        }).show();
    }

    protected RecyclerView.LayoutManager getLayoutManager(int flow) {
        LinearLayoutManager linearLayoutManager = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            linearLayoutManager = new LinearLayoutManager(getContext());
        }
        linearLayoutManager.setOrientation(flow);
        return linearLayoutManager;
    }

}
