package com.mywings.pay.models


data class AddMoneyTransaction(var tranId: Int, var fromAccount: String, var howManyAmount: Double, var userId: Int)