package com.example.helpmate.Cbse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_index_cbse.view.*

class IndexCbs : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_index_cbse, container, false)
        view.cnine.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_indexCbs_to_sub)
        }
        view.ctw.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_indexCbs_to_xiiSubFragment)
        }

        return view
    }

}