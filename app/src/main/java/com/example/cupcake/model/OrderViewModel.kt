package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel: ViewModel() {
// Добавили своиствам вспомогательные поля для наблюдения и изменения пользоватьльского интрефейса
    private val _quantity = MutableLiveData<Int>(0)
    val quantity: LiveData<Int> = _quantity

    private val _flavor = MutableLiveData<String>("")
    val flavor: LiveData<String> = _flavor

    private val _date = MutableLiveData<String>("")
    val date: LiveData<String> = _date

    private val _price = MutableLiveData<Double>(0.0)
    val price: LiveData<Double> = _price
// принимает количество кексов выбраных пользователем в фрагменте старт и присваевает их переменой
// количество
    fun setQuantity(numberCupcakes: Int) {
        _quantity.value = numberCupcakes
    }

    fun setFlavor(desiredFlavor: String){
        _flavor.value = desiredFlavor
    }

    fun setDate(pickupDate: String) {
        _date.value = pickupDate
    }

//    проверяет установлен ли вкус пироженого
    fun hasNoFlavorSet(): Boolean {
        return _flavor.value.isNullOrEmpty()
    }
}