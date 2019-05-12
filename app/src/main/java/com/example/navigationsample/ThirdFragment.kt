package com.example.navigationsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionInflater
import com.bumptech.glide.Glide
import com.example.navigationsample.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    val IMAGE_URI = "https://koenig-media.raywenderlich.com/uploads/2018/07/Jetpack-feature.png"

    lateinit var binding : FragmentThirdBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate<FragmentThirdBinding>(inflater, R.layout.fragment_third, container, false)


        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)
        }

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedElementEnterTransition = TransitionInflater.from(context).inflateTransition(android.R.transition.move)
        setHasOptionsMenu(true)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //activity.setupActionBarWithNavController(findNavController())
        Glide.with(this).load(IMAGE_URI).into(binding.headerImage)
    }
}