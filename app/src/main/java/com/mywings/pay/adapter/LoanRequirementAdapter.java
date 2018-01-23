package com.mywings.pay.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mywings.pay.R;
import com.mywings.pay.models.LoanTransaction;

import java.util.List;

public class LoanRequirementAdapter extends RecyclerView.Adapter<LoanRequirementAdapter.ViewHolder> {

    private List<LoanTransaction> lstLoanTransaction;

    public LoanRequirementAdapter(List<LoanTransaction> lstLoanTransaction) {
        this.lstLoanTransaction = lstLoanTransaction;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.loan_requirement_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.lblName.setText(String.valueOf(lstLoanTransaction.get(position).getUserId()));

        holder.lblAmount.setText(String.valueOf(lstLoanTransaction.get(position).getLoanAmount()));


    }

    @Override
    public int getItemCount() {
        return lstLoanTransaction.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {


        TextView lblName;
        TextView lblAmount;

        public ViewHolder(View itemView) {
            super(itemView);
            lblName = itemView.findViewById(R.id.lblUserName);
            lblAmount = itemView.findViewById(R.id.lblAmount);

        }
    }

}
