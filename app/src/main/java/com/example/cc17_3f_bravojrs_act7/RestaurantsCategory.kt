package com.example.cc17_3f_bravojrs_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

class RestaurantsCategory : Fragment() {

    private lateinit var viewModel: RestaurantsCategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_restaurants_category, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(RestaurantsCategoryViewModel::class.java)

        val restaurantDetails = listOf("Good Taste", "Mario's", "Canto")
        viewModel.setRestaurantDetails(restaurantDetails)

        setupNavigationButtons(view)

        return view
    }

    private fun setupNavigationButtons(view: View) {
        val buttonGoodTaste = view.findViewById<Button>(R.id.button_goodtaste)
        val buttonMarios = view.findViewById<Button>(R.id.button_marios)
        val buttonCanto = view.findViewById<Button>(R.id.button_canto)

        buttonGoodTaste.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Good Taste")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_good_taste, bundle)
        }

        buttonMarios.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Mario's")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_marios, bundle)
        }

        buttonCanto.setOnClickListener {
            val bundle = Bundle().apply {
                putString("restaurantName", "Canto")
            }
            findNavController().navigate(R.id.action_restaurants_category_to_canto, bundle)
        }
    }
}
