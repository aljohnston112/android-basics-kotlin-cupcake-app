package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel: ViewModel() {

    private var _quantity = MutableLiveData(0)
    val quantity get(): LiveData<Int> = _quantity
    fun setQuantity(nCupcakes: Int){
        _quantity.value = nCupcakes
    }
    private var _flavor = MutableLiveData("")
    val flavor get(): LiveData<String> = _flavor
    fun setFlavor(flavor: String){
        _flavor.value = flavor
    }
    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }
    private var _date = MutableLiveData("")
    val date get(): LiveData<String> = _date
    fun setDate(date: String){
        _date.value = date
    }
    private var _price = MutableLiveData(0.0)
    val price get(): LiveData<Double> = _price

}