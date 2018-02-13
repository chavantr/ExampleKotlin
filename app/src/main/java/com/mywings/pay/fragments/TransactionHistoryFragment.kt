package com.mywings.pay.fragments


import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import com.mywings.pay.adapter.TransferMoneyTransactionAdapter
import com.mywings.pay.models.TransferMoneyTransaction
import kotlinx.android.synthetic.main.fragment_transaction_history.*
import kotlinx.android.synthetic.main.fragment_transaction_history.view.*

class TransactionHistoryFragment : BaseFragment() {

    private lateinit var transactionHistory: View
    private lateinit var lstTransferMoneyTransaction: ArrayList<TransferMoneyTransaction>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        transactionHistory = inflater.inflate(R.layout.fragment_transaction_history, container, false)


        lstTransferMoneyTransaction = ArrayList<TransferMoneyTransaction>()


        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))
        lstTransferMoneyTransaction.add(TransferMoneyTransaction(1, 2, 3, "1234435", "43545665", 656.00))

        transactionHistory.lstTransactionHistory.layoutManager = getLayoutManager(LinearLayoutManager.VERTICAL)

        transactionHistory.lstTransactionHistory.adapter = TransferMoneyTransactionAdapter(lstTransferMoneyTransaction)

        return transactionHistory
    }
}
