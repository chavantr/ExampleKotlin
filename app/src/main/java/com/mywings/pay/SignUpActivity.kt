package com.mywings.pay

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import com.mywings.pay.models.OnRegistrationListener
import com.mywings.pay.process.UserRegistration
import kotlinx.android.synthetic.main.activity_sign_up.*
import org.json.JSONObject
import java.util.*

class SignUpActivity : PayCompactActivity(), OnRegistrationListener {


    private lateinit var dialog: Dialog
    private lateinit var registration: Registration

    private lateinit var userRegistration: UserRegistration

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
                userRegistration = UserRegistration()
                val calendar = Calendar.getInstance()
                val time = calendar.timeInMillis

                val requestName = JSONObject()
                val request = JSONObject()
                request.put("Name", getText(txtName))
                request.put("Mobile1", getText(txtMobile))
                request.put("Mobile2", getText(txtMobile))
                request.put("Address", getText(txtAddress))
                request.put("Landmark", getText(txtLandmark))
                request.put("Email", getText(txtEmail))
                request.put("Gender", if (getText(txtGender).contentEquals("Male")) 0 else 1)
                request.put("Password", getText(txtPassword))
                request.put("UserType", 2)
                request.put("UserBallance", 500)
                request.put("UID", "12345667")
                request.put("Verified", false)
                request.put("AccountNumber", "")
                request.put("UserImage", "")
                request.put("Thumb1", "")
                request.put("Thumb2", "")
                request.put("Thumb3", "")
                request.put("Thumb4", "")
                request.put("Thumb5", "")
                request.put("CreatedDate", "/Date($time)/")
                request.put("UpdatedDate", "/Date($time)/")
                request.put("Extra", "")
                request.put("Extra1", "")
                request.put("Extra2", "")
                request.put("Extra3", "")
                request.put("Extra4", "")

                requestName.put("objRegister", request)

                Log.d("request",requestName.toString());

                userRegistration.setOnRegistrationListener(this@SignUpActivity, requestName)
                //show("Registration successful", btnSignUp)
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

    override fun onSuccess(result: Boolean) {
        if (result) show("Registration successful", btnSignUp) else show("Some thing went wrong", btnSignUp)

        if(result)finish()
    }

    companion object {
        val TAKE_THUMB = 101
        val TAKE_UID = 102
        val GENDER = arrayOf("Male", "Female")

    }


}
