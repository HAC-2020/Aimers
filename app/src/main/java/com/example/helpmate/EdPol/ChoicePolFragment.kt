package com.example.helpmate.EdPol
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_choice_pol.view.*


class ChoicePolFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_choice_pol, container, false)

//        view.vid.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_choicePolFragment_to_videoActivity)
//        }
//
//        view.doc.setOnClickListener {
//            Navigation.findNavController(view).navigate(R.id.action_choicePolFragment_to_indexEdpol)
//        }

        return view

    }

}