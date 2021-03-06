package com.example.navigationwithdrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {
    private lateinit var textView2: TextView
    val args :SecondFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        textView2 = view.findViewById(R.id.textView2)

        val myNumber = args.number
        textView2.setText(myNumber.toString())

        textView2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.navigationToFirstFragment)
        }

        return view
    }

}