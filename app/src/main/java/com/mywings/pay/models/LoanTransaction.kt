package com.mywings.pay.models


data class LoanTransaction(val loanId: Int, val loanType: Int, val loanAmount: Double,
                           val qrCodeImage: String, val userId: Int, val loanStatus: Int)