package com.example.cc17_3f_bravojrs_act7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

class ShoppingCentersCategory : Fragment() {

    private lateinit var viewModel: ShoppingCentersCategoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shopping_centers_category, container, false)


        viewModel = ViewModelProvider(requireActivity()).get(ShoppingCentersCategoryViewModel::class.java)
        val shoppingCenterDetails = listOf("Porta Vaga", "Center Mall", "Abanao")
        viewModel.setShoppingCenterDetails(shoppingCenterDetails)


        setupNavigationButtons(view)
        return view
    }

    private fun setupNavigationButtons(view: View) {
        val buttonPortaVaga = view.findViewById<Button>(R.id.button_porta)
        val buttonCenterMall = view.findViewById<Button>(R.id.button_center_mall)
        val buttonAbanao = view.findViewById<Button>(R.id.button_abanao)

        buttonPortaVaga.setOnClickListener {
            val bundle = Bundle().apply {
                putString("shoppingCenterName", "Porta Vaga")
            }
            findNavController().navigate(R.id.action_shopping_centers_category_to_porta_vaga, bundle)
        }

        buttonCenterMall.setOnClickListener {
            val bundle = Bundle().apply {
                putString("shoppingCenterName", "Center Mall")
            }
            findNavController().navigate(R.id.action_shopping_centers_category_to_center_mall, bundle)
        }

        buttonAbanao.setOnClickListener {
            val bundle = Bundle().apply {
                putString("shoppingCenterName", "Abanao")
            }
            findNavController().navigate(R.id.action_shopping_centers_category_to_SM, bundle)
        }
    }
}
