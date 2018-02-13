package com.mywings.pay.process

import android.os.AsyncTask
import com.mywings.pay.models.Constants
import com.mywings.pay.models.StreamFunctions
import org.json.JSONObject


class LoanAsync : AsyncTask<JSONObject, Void, Boolean>() {

    private var onLoanListener: OnLoanListener? = null

    override fun doInBackground(vararg p: JSONObject?): Boolean {
        return StreamFunctions.convertStreamToString(StreamFunctions.postRequest(Constants.URL + Constants.LOAN_REQUEST, p[0]!!)).toInt() > 0
    }

    override fun onPostExecute(result: Boolean?) {
        onLoanListener!!.onLoanSuccess(result!!)
    }

    fun setLoanListener(onLoanListener: OnLoanListener, request: JSONObject?) {
        this.onLoanListener = onLoanListener
        super.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, request!!)
    }

}