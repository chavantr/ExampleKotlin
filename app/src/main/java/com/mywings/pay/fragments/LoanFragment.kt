package com.mywings.pay.fragments


import android.app.Fragment
import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mywings.pay.R


class LoanFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_loan, container, false)
    }
}
