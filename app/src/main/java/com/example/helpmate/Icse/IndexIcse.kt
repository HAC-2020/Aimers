package com.example.helpmate.Icse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_index_icse.view.*

class IndexIcse: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_index_icse, container, false)
        view.cten?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_indexIcse_to_ten)
        }
        view.ctwlv?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_indexIcse_to_twlv)
        }

        return view
    }

}