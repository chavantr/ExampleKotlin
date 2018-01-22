package com.mywings.pay.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mywings.pay.R
import kotlinx.android.synthetic.main.profile_fragment.view.*

class ProfileFragment : BaseFragment() {

    private lateinit var profileFragment: View

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        profileFragment = inflater!!.inflate(R.layout.profile_fragment, container, false)
        profileFragment.btnUpdate.setOnClickListener({
            if (validate()) {
                initializationOfProfileUpdate()
            } else {
                show(MESSAGE, profileFragment.btnUpdate)
            }
        })
        return profileFragment
    }

    private fun initializationOfProfileUpdate() {


    }

    private fun validate(): Boolean {
        if (getText(profileFragment.txtMobile).isNotEmpty() && getText(profileFragment.txtAddress).isNotEmpty() && getText(profileFragment.txtLandmark).isNotEmpty()) {
            return true
        }
        return false
    }
}