package com.mywings.pay.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.models.LoanTransaction;

import java.util.List;

public class LoanRequirementAdapter extends RecyclerView.Adapter<LoanRequirementAdapter.ViewHolder> {

    private List<LoanTransaction> lstLoanTransaction;

    public LoanRequirementAdapter(List<LoanTransaction> lstLoanTransaction) {
        this.lstLoanTransaction = lstLoanTransaction;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lstLoanTransaction.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
