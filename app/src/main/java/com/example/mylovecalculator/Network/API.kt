package com.example.mylovecalculator.Network

import com.example.mylovecalculator.Model.ResultResponse
import com.example.mylovecalculator.Utils.Constants.Companion.API_KEY
import com.example.mylovecalculator.Utils.Constants.Companion.Host
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface API {
    @Headers("X-RapidAPI-Key:$API_KEY ","X-RapidAPI-Host:$Host")
    @GET("getPercentage")
    suspend fun getresult(
        @Query("fname")yourname:String,
        @Query("sname") partnername:String
    ):ResultResponse
}