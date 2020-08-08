package com.example.helpmate.Icse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_ten.view.*

class ten : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_ten, container, false)
//        view.maths.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.sci.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.ssc.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.english.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.hindi.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.comp.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }

        return view
    }
}