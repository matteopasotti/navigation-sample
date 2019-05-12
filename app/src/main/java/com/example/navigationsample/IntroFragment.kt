package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationsample.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {

    lateinit var binding : FragmentIntroBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentIntroBinding>( inflater , R.layout.fragment_intro , container , false)

        initUI()

        return binding.root
    }

    private fun initUI() {
        binding.btnNavigate.setOnClickListener {
            view!!.findNavController().navigate(R.id.action_introFragment_to_firstFragment)
        }
    }
}