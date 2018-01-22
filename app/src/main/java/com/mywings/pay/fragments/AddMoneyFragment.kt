package com.mywings.pay.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import kotlinx.android.synthetic.main.fragment_add_money.view.*


class AddMoneyFragment : BaseFragment() {

    private lateinit var addMoney: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        addMoney = inflater.inflate(R.layout.fragment_add_money, container, false)
        addMoney.btnAddMoney.setOnClickListener {
            if (validate()) {
                initializationOfAddMoney()
            } else {
                show("All fields (*) are mandatory.", addMoney.btnAddMoney)
            }
        }
        return addMoney
    }

    private fun initializationOfAddMoney() {

    }

    private fun validate(): Boolean {
        if (getText(addMoney.txtAccountNumber).isNotEmpty() && getText(addMoney.txtAmount).isNotEmpty()) {
            return true
        }
        return false
    }
}
