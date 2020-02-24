package com.freshappbooks.mycryptoapp.pojo

import com.freshappbooks.mycryptoapp.pojo.CoinInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Datum (
    @SerializedName("CoinInfo")
    @Expose
    val coinInfo: CoinInfo? = null
)
