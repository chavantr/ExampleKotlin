package com.mywings.pay.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.mywings.pay.R
import com.mywings.pay.models.User
import kotlinx.android.synthetic.main.view_request_row.view.*


class ViewRequestAdapter(lstViewUserRequest: List<User>?) : RecyclerView.Adapter<ViewRequestAdapter.ViewHolder>() {

    private var lstViewUserRequest: List<User>? = null

    init {
        this.lstViewUserRequest = lstViewUserRequest
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view: View? = LayoutInflater.from(parent!!.context).inflate(R.layout.view_request_row, parent, false)
        return ViewHolder(view!!)
    }

    override fun getItemCount(): Int {
        return lstViewUserRequest!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.lblUserName!!.text = lstViewUserRequest!!.get(position).name
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val lblUserName: TextView? = itemView.lblUserName
        val btnConfirm: Button? = itemView.btnApprove
        val btnReject: Button? = itemView.btnReject
    }

}