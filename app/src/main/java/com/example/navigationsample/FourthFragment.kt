package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    lateinit var binding : FragmentFourthBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentFourthBinding>(inflater, R.layout.fragment_fourth, container, false)

        binding.btnPoptoInclusive.setOnClickListener {
            // pop to IntroFragment inclusive
            findNavController().navigate(R.id.action_fourthFragment_to_introFragment)
        }

        return binding.root
    }
}