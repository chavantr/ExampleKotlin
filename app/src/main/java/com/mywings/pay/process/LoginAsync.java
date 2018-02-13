package com.mywings.pay.process;


import android.os.AsyncTask;

import org.json.JSONObject;

public class LoginAsync extends AsyncTask<JSONObject, Void, String> {

    private OnLoginListener onLoginListener;

    public void setOnLoginListener(OnLoginListener onLoginListener, JSONObject request) {
        this.onLoginListener = onLoginListener;
        super.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, request);
    }

    @Override
    protected String doInBackground(JSONObject... jsonObjects) {
        return null;
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        onLoginListener.onLoginSuccess(result);
    }
}
