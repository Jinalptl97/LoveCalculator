package com.example.mylovecalculator.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mylovecalculator.MainActivity
import com.example.mylovecalculator.R
import com.example.mylovecalculator.databinding.FragmentInputBinding
import com.example.mylovecalculator.databinding.FragmentResultBinding

class ResultFragment:Fragment(R.layout.fragment_result) {

    lateinit var binding: FragmentResultBinding
    lateinit var viewModel: ResultViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentResultBinding.bind(view)
        viewModel=(activity as MainActivity).viewModel

        viewModel.resultLiveData.observe(viewLifecycleOwner){response->
            Log.e("percentage",response.percentage)
            binding.perncentage.text=response.percentage+"%"
            binding.result.text=response.result

        }
    }
}