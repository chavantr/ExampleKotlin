package com.mywings.pay.fragments


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import com.mywings.pay.process.AddMoneyAsync
import com.mywings.pay.process.OnAddMoneyListener
import kotlinx.android.synthetic.main.fragment_add_money.*
import kotlinx.android.synthetic.main.fragment_add_money.view.*
import org.json.JSONObject
import java.util.*


class AddMoneyFragment : BaseFragment(), OnAddMoneyListener {


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

        val addMoneyAsync = AddMoneyAsync()

        val request = JSONObject()

        val params = JSONObject()

        val currentTime = Calendar.getInstance().timeInMillis

        params.put("TransactionDate", "/Date($currentTime)/")

        params.put("FromAccount", getText(addMoney.txtAccountNumber))

        params.put("HowManyAmount", Integer.valueOf(getText(addMoney.txtAmount)))

        params.put("UserId", 1);

        request.put("objAddMoney", params)

        Log.d("request",request.toString())

        addMoneyAsync.setOnAddMoneyListener(this, request)

    }

    private fun validate(): Boolean {
        if (getText(addMoney.txtAccountNumber).isNotEmpty() && getText(addMoney.txtAmount).isNotEmpty()) {
            return true
        }
        return false
    }

    override fun onSuccess(inserted: Int) {
        if (inserted > 0)
            show("Money added successfully.", addMoney.btnAddMoney)
        else
            show("Some thing went wrong.", addMoney.btnAddMoney)
    }
}
