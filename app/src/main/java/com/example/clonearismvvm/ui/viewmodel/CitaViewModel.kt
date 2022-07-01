package com.example.clonearismvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clonearismvvm.data.model.CitaModel
import com.example.clonearismvvm.domain.GetCitasInteractor
import com.example.clonearismvvm.domain.RandomCitasInteractor
import kotlinx.coroutines.launch

class CitaViewModel : ViewModel() {

    val citaModel = MutableLiveData<CitaModel>()
    val siCarga = MutableLiveData<Boolean>()
    var getCitasInteractor = GetCitasInteractor()
    var randomCitasInteractor = RandomCitasInteractor()

    fun onCreate() {
        viewModelScope.launch{
            siCarga.postValue(true)
            val result:List<CitaModel>? = getCitasInteractor()
            if(!result.isNullOrEmpty()){
                citaModel.postValue(result[0])
                siCarga.postValue(false)
            }
        }
    }
    fun randomCita(){
        siCarga.postValue(true)
        val cita:CitaModel? = randomCitasInteractor()
        if(cita!=null){
            citaModel.postValue(cita)
        }
//        citaModel.postValue(citaActual)
        siCarga.postValue(false)

    }

}