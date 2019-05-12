package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.navigationsample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding : FragmentSecondBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater, R.layout.fragment_second, container, false)

        var args = arguments?.let { SecondFragmentArgs.fromBundle(it) }
        binding.txtArgumentValue.text = args!!.textInput


        return binding.root
    }
}