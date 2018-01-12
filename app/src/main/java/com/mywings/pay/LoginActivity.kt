package com.mywings.pay

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : PayCompactActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        events()
    }

    private fun events() {
        btnSignUp.setOnClickListener({
            startSignUp()
        })

        btnSign.setOnClickListener {
            if (getText(txtEmail).isNotEmpty() && getText(txtPassword).isNotEmpty()) {
                startDashboard()
            } else {
                show("Enter username & password", btnSign)
            }

        }
    }

    private fun startDashboard() {
        val intent = Intent(this@LoginActivity, DashboardActivity::class.java)
        startActivity(intent)
    }

    private fun startSignUp() {
        val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
        startActivity(intent)
    }
}
