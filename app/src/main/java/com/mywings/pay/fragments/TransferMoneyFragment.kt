package com.mywings.pay.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import kotlinx.android.synthetic.main.fragment_transfer_money.view.*


class TransferMoneyFragment : BaseFragment() {

    private lateinit var transferMoney: View;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        transferMoney = inflater.inflate(R.layout.fragment_transfer_money, container, false)

        events()

        return transferMoney
    }

    private fun events() {
        transferMoney.btnTransferMoney.setOnClickListener({
            if (validate()) {
                initializationOfTransferMoney()
            } else {
                show(MESSAGE, transferMoney.btnTransferMoney)
            }
        })
    }

    private fun initializationOfTransferMoney() {
    }

    private fun validate(): Boolean {
        if (getText(transferMoney.txtAccountNumber).isNotEmpty() &&
                !transferMoney.spnUsers.selectedItem.toString().contentEquals("Select") &&
                getText(transferMoney.txtAmount).isNotEmpty()) {
            return true
        }
        return false
    }

}
