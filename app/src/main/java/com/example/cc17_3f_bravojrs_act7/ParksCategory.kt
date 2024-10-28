package com.example.cc17_3f_bravojrs_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [parks_category.newInstance] factory method to
 * create an instance of this fragment.
 */
class ParksCategory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_parks_category, container, false)
        val buttonBurnhamPark = view.findViewById<Button>(R.id.button_burnham)
        val buttonMinesView = view.findViewById<Button>(R.id.button_mines_view)
        val buttonBotanical = view.findViewById<Button>(R.id.button_botanical)


        buttonBurnhamPark.setOnClickListener{
            findNavController().navigate(R.id.action_parks_category_to_burnham_park)
        }

        buttonMinesView.setOnClickListener{
            findNavController().navigate(R.id.action_parks_category_to_mines_view)
        }

        buttonBotanical.setOnClickListener{
            findNavController().navigate(R.id.action_parks_category_to_botanical)
        }


        return view

    }
}