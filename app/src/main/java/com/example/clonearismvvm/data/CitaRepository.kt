package com.example.clonearismvvm.data

import com.example.clonearismvvm.data.model.CitaModel
import com.example.clonearismvvm.data.model.CitaProvider
import com.example.clonearismvvm.data.network.CitaService

class CitaRepository {

    private val api = CitaService()

    suspend fun getAllCitas():List<CitaModel>{
        val response:List<CitaModel> = api.getCitas()
        CitaProvider.citas = response
        return response
    }
}