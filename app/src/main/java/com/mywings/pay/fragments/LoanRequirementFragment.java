package com.mywings.pay.fragments;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;


public class LoanRequirementFragment extends BaseFragment {


    private View loanRequirement;

    private RecyclerView lstRecycleView;


    public LoanRequirementFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        loanRequirement = inflater.inflate(R.layout.fragment_loan_requirement, container, false);

        lstRecycleView = loanRequirement.findViewById(R.id.lstLoanRequirement);

        return loanRequirement;
    }

}
