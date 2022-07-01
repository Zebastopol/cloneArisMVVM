package com.example.clonearismvvm.data.network

import com.example.clonearismvvm.data.model.CitaModel
import retrofit2.Response
import retrofit2.http.GET

interface CitaApiCliente {
    @GET("/.json")
    suspend fun getAllCitas(): Response<List<CitaModel>>
}