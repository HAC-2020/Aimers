package com.example.helpmate.Cbse


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_choice_cb.view.*

class ChoiceCbFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_choice_cb, container, false)
        view.docs.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_choiceCbFragment_to_indexCbs)
        }
        view.video.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_choiceCbFragment_to_videoActivity2)
        }
        return view
    }

}