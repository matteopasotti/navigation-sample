package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.navigationsample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var binding : FragmentSecondBinding

    val IMAGE_URI = "https://koenig-media.raywenderlich.com/uploads/2018/07/Jetpack-feature.png"


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater, R.layout.fragment_second, container, false)

        var args = arguments?.let { SecondFragmentArgs.fromBundle(it) }
        binding.txtArgumentValue.text = args!!.textInput

        binding.btnNext.setOnClickListener {

            val extras = FragmentNavigatorExtras(
                binding.image to "imageView"
            )

            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment , null, null , extras)
        }


        Glide.with(context!!).load(IMAGE_URI).centerCrop().into(binding.image)


        return binding.root
    }
}