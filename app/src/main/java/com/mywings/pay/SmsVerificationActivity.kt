package com.mywings.pay

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sms_verification.*

class SmsVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_verification)
        events()
    }

    private fun events() {
        btnVerify.setOnClickListener({ startThumbVerification() })
    }

    private fun startThumbVerification() {
        val intent = Intent(this@SmsVerificationActivity, ThumbVerificationActivity::class.java)
        startActivity(intent)
    }
}
