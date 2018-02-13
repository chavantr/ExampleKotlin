package com.mywings.pay.models


data class User(val userId: Int = -1, val name: String = "", val mobile1: String = "", val mobile2: String = ""
                , val address: String = "", val landmark: String = "", val email: String = "", val gender: Int = -1,
                val password: String = "", val userType: Int = -1, val userBalance: Double = 0.0, val uId: String = ""
                , val verified: Boolean = false, val userImage: String = "", val thumb1: String = "", val thumb2: String = "",
                val thumb3: String = "", val thumb4: String = "", val thumb5: String = "")