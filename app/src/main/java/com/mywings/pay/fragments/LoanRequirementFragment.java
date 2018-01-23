package com.mywings.pay.fragments;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.R;
import com.mywings.pay.adapter.LoanRequirementAdapter;
import com.mywings.pay.models.LoanTransaction;

import java.util.ArrayList;
import java.util.List;


public class LoanRequirementFragment extends BaseFragment {


    private View loanRequirement;

    private RecyclerView lstRecycleView;

    private List<LoanTransaction> lstLoanTransaction;


    public LoanRequirementFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        loanRequirement = inflater.inflate(R.layout.fragment_loan_requirement, container, false);

        lstRecycleView = loanRequirement.findViewById(R.id.lstLoanRequirement);


        lstLoanTransaction = new ArrayList<>();

        lstLoanTransaction.add(new LoanTransaction(1, 1, 100, "", 5, 1));

        lstLoanTransaction.add(new LoanTransaction(1, 1, 100, "", 5, 1));
        lstLoanTransaction.add(new LoanTransaction(1, 1, 100, "", 5, 1));
        lstLoanTransaction.add(new LoanTransaction(1, 1, 100, "", 5, 1));
        lstLoanTransaction.add(new LoanTransaction(1, 1, 100, "", 5, 1));

        lstRecycleView.setLayoutManager(getLayoutManager(LinearLayoutManager.VERTICAL));

        lstRecycleView.setAdapter(new LoanRequirementAdapter(lstLoanTransaction));


        return loanRequirement;
    }

}
