package com.mywings.pay

import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText


abstract class PayCompactActivity : AppCompatActivity() {
    protected fun getText(view: EditText?): String {
        return view!!.text.toString()
    }

    protected fun show(message: String, view: View?) {
        Snackbar.make(view!!, message, Snackbar.LENGTH_LONG).setAction("OK", { }).show()
    }
}