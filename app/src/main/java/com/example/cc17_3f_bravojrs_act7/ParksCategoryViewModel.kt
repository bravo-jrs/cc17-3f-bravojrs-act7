package com.example.cc17_3f_bravojrs_act7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParksCategoryViewModel : ViewModel() {

    private val _parkDetails = MutableLiveData<List<String>>()
    val parkDetails: LiveData<List<String>> get() = _parkDetails


    fun setParkDetails(details: List<String>) {
        _parkDetails.value = details
    }
}
