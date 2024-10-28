package com.example.cc17_3f_bravojrs_act7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RestaurantsCategoryViewModel : ViewModel() {


    private val _restaurantDetails = MutableLiveData<List<String>>()
    val restaurantDetails: LiveData<List<String>> get() = _restaurantDetails

    fun setRestaurantDetails(details: List<String>) {
        _restaurantDetails.value = details
    }
}
