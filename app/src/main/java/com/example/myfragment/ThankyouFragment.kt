package com.example.myfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ThankyouFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_thankyou, container, false)

        val tvScore = view.findViewById<TextView>(R.id.textView5)
        val scores = arguments?.getInt("scores")
        tvScore.text = scores.toString() + "%"
        return view
    }


}