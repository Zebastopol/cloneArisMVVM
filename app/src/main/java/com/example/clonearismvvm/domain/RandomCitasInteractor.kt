package com.example.clonearismvvm.domain

import com.example.clonearismvvm.data.model.CitaModel
import com.example.clonearismvvm.data.model.CitaProvider

class RandomCitasInteractor {


    operator fun invoke(): CitaModel?{
        val citas:List<CitaModel> = CitaProvider.citas
        if(!citas.isNullOrEmpty()){
            val citAleatoria:Int = (citas.indices
                    /**(0..citas.size-1) = (citas.indices)**/
                    ).random()
            return citas[citAleatoria]
        }
        return null
    }
}