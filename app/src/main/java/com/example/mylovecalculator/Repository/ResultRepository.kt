package com.example.mylovecalculator.Repository

import com.example.mylovecalculator.Network.RetrofitInstance

class ResultRepository {
    suspend fun getResult(yourName:String,partnerName:String)=RetrofitInstance.api.getresult(yourName,partnerName)
}