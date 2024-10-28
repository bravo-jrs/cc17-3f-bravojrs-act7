package com.example.cc17_3f_bravojrs_act7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeScreenViewModel : ViewModel() {

    private val _restaurantRecommendations = MutableLiveData<List<String>>()
    val restaurantRecommendations: LiveData<List<String>> get() = _restaurantRecommendations

    private val _shoppingCenterRecommendations = MutableLiveData<List<String>>()
    val shoppingCenterRecommendations: LiveData<List<String>> get() = _shoppingCenterRecommendations

    private val _parkRecommendations = MutableLiveData<List<String>>()
    val parkRecommendations: LiveData<List<String>> get() = _parkRecommendations
}
