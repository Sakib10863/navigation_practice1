package com.example.navigation_practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigation_practice1.databinding.ActivityMainBinding
import com.example.navigation_practice1.databinding.FragmentSecondFregmentBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navHostFragment = (supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment )
        navController = navHostFragment.navController
    }
}