package com.mywings.pay.fragments


import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import com.mywings.pay.process.LoanAsync
import com.mywings.pay.process.OnLoanListener
import kotlinx.android.synthetic.main.fragment_loan.view.*
import org.json.JSONObject


class LoanFragment : BaseFragment(), OnLoanListener {
    private lateinit var loanFragment: View
    private var fileAdded: Boolean = false
    private var selectedFile: String? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        loanFragment = inflater.inflate(R.layout.fragment_loan, container, false)
        events()
        return loanFragment
    }

    private fun events() {
        loanFragment.btnSubmit.setOnClickListener({
            if (validate()) {
                initializationOfLoanProcess()
            } else {
                show(MESSAGE, loanFragment.btnSubmit)
            }
        })
        loanFragment.btnUploadQrImage.setOnClickListener({
            val intent = Intent(Intent.ACTION_GET_CONTENT).setType("file/*")
            startActivityForResult(intent, LAUNCH_DOC)
        })
    }

    private fun initializationOfLoanProcess() {
        val loanRequest = LoanAsync()
        val request = JSONObject()
        val params = JSONObject()
        params.put("LoanTypeId", 1)
        params.put("LoanAmount", getText(loanFragment.txtLoanAmount).toInt())
        params.put("QRCode", null)
        params.put("UserId", 1)
        params.put("LoanStatus", 1)
        params.put("Extra", "")
        params.put("Extra1", "")
        params.put("Extra2", "")
        params.put("Extra3", "")
        params.put("Extra4", "")
        request.put("objLoanRequest", params)
        loanRequest.setLoanListener(this, request);
    }

    private fun validate(): Boolean {
        if (!loanFragment.spnLoanReasons.selectedItem.toString().contentEquals("Select")) {
            return true
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (resultCode) {
            RESULT_OK -> {
                when (requestCode) {
                    LAUNCH_DOC -> {

                    }
                }
            }
        }
    }

    override fun onLoanSuccess(loan: Boolean) {
        if (loan) show("Requested submitted", loanFragment.btnSubmit) else show("Some thing went wrong", loanFragment.btnSubmit)
    }

    companion object {
        const val LAUNCH_DOC = 101
    }
}
