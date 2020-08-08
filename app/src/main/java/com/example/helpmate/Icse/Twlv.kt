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
        view.mths.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twMathPdf2)
        }
        view.chem.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twChemPdf2)
        }
        view.phy.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twPhyPdf2)
        }
        view.english.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twEngPdf2)
        }
        view.bio.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twBioPdf2)
        }
        view.phe.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_twlv_to_twPhePdf2)
        }

        return view
    }
}