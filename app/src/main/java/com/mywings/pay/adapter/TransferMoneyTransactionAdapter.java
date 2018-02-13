package com.mywings.pay.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mywings.pay.R;
import com.mywings.pay.models.TransferMoneyTransaction;

import java.util.List;


public class TransferMoneyTransactionAdapter extends RecyclerView.Adapter<TransferMoneyTransactionAdapter.ViewHolder> {


    private List<TransferMoneyTransaction> lstTransferMoneyTransaction;

    public TransferMoneyTransactionAdapter(List<TransferMoneyTransaction> lstTransferMoneyTransaction) {
        this.lstTransferMoneyTransaction = lstTransferMoneyTransaction;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transfer_money_transaction_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.lblAmount.setText(String.valueOf(lstTransferMoneyTransaction.get(position).getAmount()));

        holder.lblStatus.setText(position % 2 == 0 ? "Sent" : "Received");

    }

    @Override
    public int getItemCount() {
        return lstTransferMoneyTransaction.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {


        TextView lblAmount;
        TextView lblStatus;


        public ViewHolder(View itemView) {
            super(itemView);
            lblAmount = itemView.findViewById(R.id.lblAmount);
            lblStatus = itemView.findViewById(R.id.lblStatus);
        }
    }

}
