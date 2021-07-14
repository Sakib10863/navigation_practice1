package com.example.navigation_practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.navigation_practice1.databinding.FragmentFirstFregmentBinding


class first_fregment : Fragment() {
    private var _binding : FragmentFirstFregmentBinding ? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstFregmentBinding.inflate(inflater, container, false)
        binding.textView1.setOnClickListener {
            findNavController().navigate(R.id.navigateToSecondFregment)
        }

        return binding.root




    }
}





