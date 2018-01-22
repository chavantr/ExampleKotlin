package com.mywings.pay.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R

class TransactionHistoryFragment : BaseFragment() {

    private lateinit var transactionHistory: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        transactionHistory = inflater.inflate(R.layout.fragment_transaction_history, container, false)



        return transactionHistory
    }
}
