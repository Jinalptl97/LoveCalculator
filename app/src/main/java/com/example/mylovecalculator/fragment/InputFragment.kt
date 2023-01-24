package com.example.mylovecalculator.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.mylovecalculator.MainActivity
import com.example.mylovecalculator.R
import com.example.mylovecalculator.databinding.ActivityMainBinding
import com.example.mylovecalculator.databinding.FragmentInputBinding

class InputFragment : Fragment(R.layout.fragment_input) {

    private  lateinit var binding: FragmentInputBinding
    private lateinit var viewModel:ResultViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentInputBinding.bind(view)
        viewModel=(activity as MainActivity).viewModel

        binding.btnSubmit.setOnClickListener{
            viewModel.getresult(binding.etYourName.text.toString(),binding.etPartnerName.text.toString())
            findNavController().navigate(R.id.action_inputFragment_to_resultFragment)
        }
    }
}