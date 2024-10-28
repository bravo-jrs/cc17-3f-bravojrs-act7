package com.example.cc17_3f_bravojrs_act7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoppingCentersCategoryViewModel : ViewModel() {

    private val _shoppingCenterDetails = MutableLiveData<List<String>>()
    val shoppingCenterDetails: LiveData<List<String>> get() = _shoppingCenterDetails

    fun setShoppingCenterDetails(details: List<String>) {
        _shoppingCenterDetails.value = details
    }
}
