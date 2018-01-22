package com.mywings.pay.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;

public class ViewRequestFragment extends BaseFragment {


    private View viewRequest;
    private RecyclerView lstViewRequest;

    public ViewRequestFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        viewRequest = inflater.inflate(R.layout.fragment_view_request, container, false);

        lstViewRequest = viewRequest.findViewById(R.id.lstViewRequest);
        

        return viewRequest;
    }

}
