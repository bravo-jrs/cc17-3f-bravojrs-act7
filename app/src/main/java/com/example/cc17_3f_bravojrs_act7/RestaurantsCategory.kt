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
 * Use the [restaurants_category.newInstance] factory method to
 * create an instance of this fragment.
 */
class RestaurantsCategory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_restaurants_category, container, false)
        val buttonGoodTaste = view.findViewById<Button>(R.id.button_goodtaste)
        val buttonMarios = view.findViewById<Button>(R.id.button_marios)
        val buttonCanto = view.findViewById<Button>(R.id.button_canto)


        buttonGoodTaste.setOnClickListener{
            findNavController().navigate(R.id.action_restaurants_category_to_good_taste)
        }

        buttonMarios.setOnClickListener{
            findNavController().navigate(R.id.action_restaurants_category_to_marios)
        }

        buttonCanto.setOnClickListener{
            findNavController().navigate(R.id.action_restaurants_category_to_canto)
        }


    return view

    }
}
