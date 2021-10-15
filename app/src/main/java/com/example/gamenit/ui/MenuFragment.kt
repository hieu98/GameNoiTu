package com.example.gamenit.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.gamenit.R
import kotlinx.android.synthetic.main.fragment_menu.view.*

class MenuFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.btn_play.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.play_fragment)
        }

        view.btn_out.setOnClickListener{
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra("exit","exit")
            Log.d("exit","true")
            startActivity(intent)
        }

        return view
    }
}