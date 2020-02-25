package com.freshappbooks.mycryptoapp.api

import com.freshappbooks.mycryptoapp.pojo.CoinInfoListOfData
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Single

interface ApiService {
    companion object {
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"
        private const val QUERY_PARAM_API_LEY = "tsym"
        private const val  CURRENCY = "USD"
    }

    @GET ("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(QUERY_PARAM_API_LEY) apiKey: String = "",
        @Query(QUERY_PARAM_LIMIT) limit: Int = 100,
        @Query(QUERY_PARAM_TO_SYMBOL) tSym: String = CURRENCY
        ): Single<CoinInfoListOfData>

    @GET ("pricemultifull")
    fun getFullPriceList(
        @Query(QUERY_PARAM_API_LEY) apiKey: String = "",
        @Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY,
        @Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String
    ): Single<CoinInfoListOfData>
}