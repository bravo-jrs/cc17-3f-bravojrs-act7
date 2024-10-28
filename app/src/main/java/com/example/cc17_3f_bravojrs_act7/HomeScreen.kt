package com.example.cc17_3f_bravojrs_act7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

class HomeScreen : Fragment() {

    private lateinit var viewModel: HomeScreenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_screen, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(HomeScreenViewModel::class.java)

        viewModel.restaurantRecommendations.observe(viewLifecycleOwner) { recommendations ->
            val restaurantTextView = view.findViewById<TextView>(R.id.city_desc1)
            restaurantTextView.text = recommendations.joinToString(", ")
        }

        viewModel.shoppingCenterRecommendations.observe(viewLifecycleOwner) { recommendations ->
            val shoppingTextView = view.findViewById<TextView>(R.id.city_desc2)
            shoppingTextView.text = recommendations.joinToString(", ")
        }

        viewModel.parkRecommendations.observe(viewLifecycleOwner) { recommendations ->
            val parkTextView = view.findViewById<TextView>(R.id.city_desc3)
            parkTextView.text = recommendations.joinToString(", ")
        }


        setupButtonNavigation(view)

        return view
    }

    private fun setupButtonNavigation(view: View) {
        val buttonExploreRestaurant = view.findViewById<Button>(R.id.button_explore1)
        val buttonExploreShoppingCenters = view.findViewById<Button>(R.id.button_explore2)
        val buttonExploreParks = view.findViewById<Button>(R.id.button_explore3)

        buttonExploreRestaurant.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreenFragment_to_restaurants_category)
        }

        buttonExploreShoppingCenters.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreenFragment_to_shopping_centers_category)
        }

        buttonExploreParks.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreenFragment_to_parks_category)
        }
    }
}
