package com.example.navigation_practice1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigation_practice1.databinding.FragmentSecondFregmentBinding


class second_fregment : Fragment() {

    private var _binding : FragmentSecondFregmentBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondFregmentBinding.inflate(inflater, container, false)
        binding.textView2.setOnClickListener {
            findNavController().navigate(R.id.navigateToFirstFregment)
        }
        return binding.root
    }

}
