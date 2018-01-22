package com.mywings.pay.models


data class TransferMoneyTransaction(val transId: Int, val senderId: Int, val receiverId: Int, val senderAccountNo: String
                                    , val receiverAccountNo: String, val amount: Double)