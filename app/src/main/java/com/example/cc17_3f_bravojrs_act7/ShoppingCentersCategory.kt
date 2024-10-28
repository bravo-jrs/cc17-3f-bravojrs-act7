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
 * Use the [shopping_centers_category.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoppingCentersCategory : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_shopping_centers_category, container, false)
        val buttonPortaVaga = view.findViewById<Button>(R.id.button_porta)
        val buttonCenterMall = view.findViewById<Button>(R.id.button_center_mall)
        val buttonAbanao = view.findViewById<Button>(R.id.button_abanao)


        buttonPortaVaga.setOnClickListener{
            findNavController().navigate(R.id.action_shopping_centers_category_to_porta_vaga)
        }

        buttonCenterMall.setOnClickListener{
            findNavController().navigate(R.id.action_shopping_centers_category_to_center_mall)
        }

        buttonAbanao.setOnClickListener{
            findNavController().navigate(R.id.action_shopping_centers_category_to_SM)
        }


        return view

    }
}
