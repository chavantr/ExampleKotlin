package com.mywings.pay

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sms_verification.*

class SmsVerificationActivity : PayCompactActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sms_verification)
        events()
    }

    private fun events() {
        btnVerify.setOnClickListener({
            if (getText(txtEnterOTP).isNotEmpty()) startThumbVerification() else show("Enter OTP", btnVerify)
        })
    }

    private fun startThumbVerification() {
        val intent = Intent(this@SmsVerificationActivity, ThumbVerificationActivity::class.java)
        startActivity(intent)
    }
}
