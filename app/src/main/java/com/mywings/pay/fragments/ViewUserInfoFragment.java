package com.mywings.pay.fragments;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;
import com.mywings.pay.adapter.ViewRequestAdapter;
import com.mywings.pay.models.User;

import java.util.ArrayList;
import java.util.List;


public class ViewUserInfoFragment extends BaseFragment {

    private View viewUserInfo;

    private RecyclerView lstUserInfo;
    private List<User> lstViewRequests;

    public ViewUserInfoFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        viewUserInfo = inflater.inflate(R.layout.fragment_view_user_info, container, false);

        lstUserInfo = viewUserInfo.findViewById(R.id.lstUsers);


        lstViewRequests = new ArrayList<>();

        lstViewRequests.add(new User(1, "User1", "", "", "",
                "", "", 1, "", 1, 5.0, "", false, "",
                "", "", "", "", ""));
        lstViewRequests.add(new User(1, "User2", "", "", "",
                "", "", 1, "", 1, 5.0, "", false, "",
                "", "", "", "", ""));
        lstViewRequests.add(new User(1, "User3", "", "", "",
                "", "", 1, "", 1, 5.0, "", false, "",
                "", "", "", "", ""));
        lstViewRequests.add(new User(1, "User4", "", "", "",
                "", "", 1, "", 1, 5.0, "", false, "",
                "", "", "", "", ""));
        lstViewRequests.add(new User(1, "User5", "", "", "",
                "", "", 1, "", 1, 5.0, "", false, "",
                "", "", "", "", ""));

        lstUserInfo.setLayoutManager(getLayoutManager(LinearLayoutManager.VERTICAL));

        lstUserInfo.setAdapter(new ViewRequestAdapter(lstViewRequests));

        return viewUserInfo;
    }

}
