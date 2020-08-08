package com.example.helpmate.Cbse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_xii_sub.view.*

class XiiSubFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_xii_sub, container, false)
        view.mths.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twMathPdf)
        }
        view.chem.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twChemPdf)
        }
        view.phy.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twPhyPdf)
        }
        view.english.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twEngPdf)
        }
        view.bio.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twBioPdf)
        }
        view.phe.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_xiiSubFragment_to_twPhePdf)
        }
        return view
    }

}