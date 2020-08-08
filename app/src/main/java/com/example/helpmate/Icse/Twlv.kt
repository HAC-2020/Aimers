package com.example.helpmate.Icse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_twlv.view.*

class Twlv : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_twlv, container, false)
//        view.mths.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.chem.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.phy.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.english.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.bio.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }
//        view.phe.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.)
//        }

        return view
    }
}