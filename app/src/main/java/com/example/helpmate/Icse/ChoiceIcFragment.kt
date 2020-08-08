package com.example.helpmate.Icse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_choice_ic.view.*

class ChoiceIcFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_choice_ic, container, false)

        view.doc.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_choiceIcFragment_to_indexIcse)
        }

        view.video.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_choiceIcFragment_to_videoActivity3)
        }

        return view
    }

}