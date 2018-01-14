package com.mywings.pay

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_thumb_verification.*

class ThumbVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thumb_verification)
        events()
    }

    private fun events() {
        btnConfirm.setOnClickListener({ startDashboard() })
    }

    private fun startDashboard() {
        val intent = Intent(this@ThumbVerificationActivity, DashboardActivity::class.java)
        startActivity(intent)
    }
}
