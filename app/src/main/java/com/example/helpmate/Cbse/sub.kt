package com.example.helpmate.Cbse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_sub.view.*


class sub : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_sub, container, false)
        view.maths.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_nineMathPdf)
        }
        view.sci.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_ninePdfSci)
        }
        view.ssc.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_ninePdfSsc)
        }
        view.english.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_ninePdfEng)
        }
        view.hindi.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_ninePdfHindi)
        }
        view.comp.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_sub_to_ninePdfComp2)
        }

        return view
    }
}