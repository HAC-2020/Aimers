package com.example.helpmate.LoginScreen


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.helpmate.R
import kotlinx.android.synthetic.main.fragment_login.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_login, container, false)
        view.btn_isc.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_choiceIcFragment)
        }
        view.btn_cbse.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_choiceCbFragment)
        }
        view.btn_edpol.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_choicePolFragment)
        }
        view.btn_eng.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_indexEng)
        }
        view.btn_med.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_indexMed)
        }
        view.btn_law.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_indexLaw)
        }
        return view
    }

}