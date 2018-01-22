package com.mywings.pay.fragments;


import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;


public class ViewUserInfoFragment extends BaseFragment {

    private View viewUserInfo;

    private RecyclerView lstUserInfo;

    public ViewUserInfoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewUserInfo = inflater.inflate(R.layout.fragment_view_user_info, container, false);

        lstUserInfo = viewUserInfo.findViewById(R.id.lstUsers);

        return viewUserInfo;
    }

}
