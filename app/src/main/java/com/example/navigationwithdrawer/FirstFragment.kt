package com.example.navigationwithdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FirstFragment : Fragment() {
    private lateinit var textView1: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_first, container, false)
        textView1 = view.findViewById<TextView>(R.id.textView1)

        textView1.setOnClickListener {
            val action = FirstFragmentDirections.navigateToSecondFragment()
            Navigation.findNavController(view).navigate(action)
        }

        return view
    }
}