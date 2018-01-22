package com.mywings.pay.models


data class AtmLocation(var atmId: Int, var name: String, var location: String,
                       var latitude: String, var longitude: String, var userId: Int)