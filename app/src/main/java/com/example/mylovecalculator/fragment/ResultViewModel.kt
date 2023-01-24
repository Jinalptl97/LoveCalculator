package com.example.mylovecalculator.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mylovecalculator.Model.ResultResponse
import com.example.mylovecalculator.Repository.ResultRepository
import kotlinx.coroutines.launch

class ResultViewModel(
    val resultRepository: ResultRepository
) : ViewModel() {

    val resultLiveData = MutableLiveData<ResultResponse>()

    fun getresult(yourName: String, partnerName: String) = viewModelScope.launch {
       var response=resultRepository.getResult(yourName, partnerName)
        resultLiveData.postValue(response)
    }
}