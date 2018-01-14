package com.mywings.pay

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : PayCompactActivity() {

    private lateinit var dialog: Dialog
    private lateinit var registration: Registration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        events()
    }

    private fun events() {
        txtGender.setOnClickListener({
            selectGender()
        })
        btnSignUp.setOnClickListener({
            if (validate()) {
                show("Registration successful", btnSignUp)
            } else {
                show("All Fields (*) required.", btnSignUp)
            }
        })
        btnThumb.setOnClickListener({
            startThumb()
        })
        btnUploadUid.setOnClickListener({
            startTakeUID()
        })
    }

    private fun startTakeUID() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if (null != intent.resolveActivity(packageManager)) {
            startActivityForResult(intent, TAKE_UID)
        }
    }

    private fun startThumb() {
        val intent = Intent(this@SignUpActivity, TakeThumbActivity::class.java)
        startActivityForResult(intent, TAKE_THUMB)
    }

    private fun selectGender() {
        val genderBuilder = AlertDialog.Builder(
                this@SignUpActivity)
        genderBuilder.setTitle("Select Gender").setIcon(R.mipmap.ic_launcher)
        genderBuilder.setSingleChoiceItems(GENDER, 0, { _, i ->
            txtGender.setText(GENDER[i])
            txtPassword.requestFocus()
            dialog.dismiss()

        })
        dialog = genderBuilder.create()
        dialog.show()
    }

    private fun validate(): Boolean {
        if (getText(txtName).isNotEmpty() && getText(txtMobile).isNotEmpty() && getText(txtAddress).isNotEmpty() &&
                getText(txtLandmark).isNotEmpty() && getText(txtEmail).isNotEmpty() && getText(txtGender).isNotEmpty() &&
                getText(txtPassword).isNotEmpty()) {
            registration = Registration(getText(txtName), getText(txtMobile), getText(txtAddress),
                    getText(txtLandmark), getText(txtEmail), 0, getText(txtPassword))
            return true
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when (resultCode) {
            RESULT_OK -> {
                when (requestCode) {
                    TAKE_THUMB -> {

                    }
                    TAKE_UID -> {

                    }
                }
            }
        }
    }

    companion object {
        val TAKE_THUMB = 101
        val TAKE_UID = 102
        val GENDER = arrayOf("Male", "Female")

    }


}
