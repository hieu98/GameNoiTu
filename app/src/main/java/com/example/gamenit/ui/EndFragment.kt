package com.example.gamenit.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.gamenit.R
import kotlinx.android.synthetic.main.fragment_end.*
import kotlinx.android.synthetic.main.fragment_end.view.*

class EndFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_end, container, false)
        view.setBackgroundResource(R.drawable.b4)
        view.btn_backmenu.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.fragment_menu)
        }

        return view
    }

}