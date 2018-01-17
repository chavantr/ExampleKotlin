package com.mywings.pay.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.mywings.pay.lib.SectionedRecyclerViewAdapter;

public class FileAdapter extends SectionedRecyclerViewAdapter<FileAdapter.ViewHolder> {



    @Override
    public int getSectionCount() {
        return 0;
    }

    @Override
    public int getItemCount(int section) {
        return 0;
    }

    @Override
    public void onBindHeaderViewHolder(ViewHolder holder, int section) {

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int section, int relativePosition, int absolutePosition) {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
