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
        view.maths.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_ten_to_nineMathPdf2)
        }
        view.sci.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_ten_to_ninePdfSsc2)
        }
        view.ssc.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_ten_to_ninePdfSci2)
        }
        view.english.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_ten_to_ninePdfEng2)
        }
        view.comp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_ten_to_ninePdfComp2)
        }

        return view
    }
}