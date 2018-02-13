package com.mywings.pay.process;

import android.os.AsyncTask;

import com.mywings.pay.models.Constants;
import com.mywings.pay.models.StreamFunctions;

import org.json.JSONObject;


public class AddMoneyAsync extends AsyncTask<JSONObject, Void, Integer> {

    private OnAddMoneyListener onAddMoneyListener;

    @Override
    protected Integer doInBackground(JSONObject... params) {
        return Integer.valueOf(StreamFunctions.Companion.convertStreamToString(StreamFunctions.Companion.postRequest(Constants.URL + Constants.ADD_MONEY, params[0])));
    }

    @Override
    protected void onPostExecute(Integer integer) {
        onAddMoneyListener.onSuccess(integer);
    }

    public void setOnAddMoneyListener(OnAddMoneyListener onAddMoneyListener,JSONObject request) {
        this.onAddMoneyListener = onAddMoneyListener;
        super.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR,request);
    }

}
