package com.example.cc17_3f_bravojrs_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

class ParksCategory : Fragment() {

    private lateinit var viewModel: ParksCategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_parks_category, container, false)


        viewModel = ViewModelProvider(requireActivity()).get(ParksCategoryViewModel::class.java)

        val parkDetails = listOf("Burnham Park", "Mines View", "Botanical Garden")
        viewModel.setParkDetails(parkDetails)

        setupNavigationButtons(view)

        return view
    }

    private fun setupNavigationButtons(view: View) {
        val buttonBurnhamPark = view.findViewById<Button>(R.id.button_burnham)
        val buttonMinesView = view.findViewById<Button>(R.id.button_mines_view)
        val buttonBotanical = view.findViewById<Button>(R.id.button_botanical)

        buttonBurnhamPark.setOnClickListener {
            val bundle = Bundle().apply {
                putString("parkName", "Burnham Park")
            }
            findNavController().navigate(R.id.action_parks_category_to_burnham_park, bundle)
        }

        buttonMinesView.setOnClickListener {
            val bundle = Bundle().apply {
                putString("parkName", "Mines View")
            }
            findNavController().navigate(R.id.action_parks_category_to_mines_view, bundle)
        }

        buttonBotanical.setOnClickListener {
            val bundle = Bundle().apply {
                putString("parkName", "Botanical Garden")
            }
            findNavController().navigate(R.id.action_parks_category_to_botanical, bundle)
        }
    }
}
