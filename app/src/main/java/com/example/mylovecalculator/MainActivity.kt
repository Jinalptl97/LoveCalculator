package com.example.mylovecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.mylovecalculator.Repository.ResultRepository
import com.example.mylovecalculator.databinding.ActivityMainBinding
import com.example.mylovecalculator.fragment.ResultViewModel
import com.example.mylovecalculator.fragment.ViewModelProviderFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController:NavController
    lateinit var  viewModel : ResultViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val resultRepository=ResultRepository()
        val resultViewModelProviderFactory=ViewModelProviderFactory(resultRepository)
        viewModel=ViewModelProvider(this, resultViewModelProviderFactory).get(ResultViewModel::class.java)

        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController=navHostFragment.findNavController()
        setupActionBarWithNavController(navController)
    }
}