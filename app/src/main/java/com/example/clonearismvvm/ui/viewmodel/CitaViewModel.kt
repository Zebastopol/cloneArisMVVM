package com.example.clonearismvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.clonearismvvm.data.model.CitaModel
import com.example.clonearismvvm.data.CitaProvider

class CitaViewModel : ViewModel() {

    val citaModel = MutableLiveData<CitaModel>()

    fun randomCita(){
        val citaActual: CitaModel = CitaProvider.aleatorio()
        citaModel.postValue(citaActual)
    }
}