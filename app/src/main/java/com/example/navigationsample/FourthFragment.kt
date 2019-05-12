package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigationsample.databinding.FragmentFourthBinding

class FourthFragment : Fragment() {

    lateinit var binding : FragmentFourthBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentFourthBinding>(inflater, R.layout.fragment_fourth, container, false)

        return binding.root
    }
}