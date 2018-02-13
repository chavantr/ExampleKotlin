package com.mywings.pay.process;

import android.os.AsyncTask;

import com.mywings.pay.models.OnRegistrationListener;
import com.mywings.pay.models.StreamFunctions;

import org.json.JSONObject;

import static com.mywings.pay.models.Constants.REGISTER;
import static com.mywings.pay.models.Constants.URL;


public class UserRegistration extends AsyncTask<JSONObject, Void, Boolean> {


    public void setOnRegistrationListener(OnRegistrationListener onRegistrationListener, JSONObject request) {
        this.onRegistrationListener = onRegistrationListener;
        super.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, request);
    }

    private OnRegistrationListener onRegistrationListener;

    @Override
    protected Boolean doInBackground(JSONObject... params) {
        return StreamFunctions.Companion.convertStreamToString(StreamFunctions.Companion.postRequest(URL + REGISTER, params[0])).contentEquals("true");
    }

    @Override
    protected void onPostExecute(Boolean result) {
        onRegistrationListener.onSuccess(result);
    }

}
