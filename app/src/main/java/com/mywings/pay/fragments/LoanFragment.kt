package com.mywings.pay.fragments


import android.app.Activity
import android.app.Activity.RESULT_OK
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import kotlinx.android.synthetic.main.fragment_loan.view.*


class LoanFragment : BaseFragment() {

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

    }

    private fun validate(): Boolean {
        if (!loanFragment.spnLoanReasons.selectedItem.toString().contentEquals("Select") && fileAdded) {
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

    companion object {
        const val LAUNCH_DOC = 101
    }
}
