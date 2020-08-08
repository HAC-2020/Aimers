package com.example.helpmate.EdPol


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_index_edpol.view.*

class IndexEdpol : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_index_edpol, container, false)
        view.id1.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_indexEdpol_to_pdfEdpol)
        }
        return view
    }

}