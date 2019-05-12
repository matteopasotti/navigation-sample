package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationsample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    lateinit var binding: FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater, R.layout.fragment_first, container, false)


        initUI()

        return binding.root
    }

    private fun initUI() {
        binding.btnNext.setOnClickListener {
            if(!binding.edittextInput.text.toString().isNullOrEmpty()) {
                //Passing an argument
                view!!.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(binding.edittextInput.text.toString()))
            }
        }
    }
}