package com.example.clonearismvvm.data.network

import com.example.clonearismvvm.core.RetrofitHelper
import com.example.clonearismvvm.data.model.CitaModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CitaService {

    private val retrofit = RetrofitHelper.getRetrofit()
    /**Importancia del uso de la Corrutina**/
    suspend fun getCitas():List<CitaModel>{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(CitaApiCliente::class.java).getAllCitas()
            response.body() ?: emptyList() /**Operador Elvis; dice:
                                            "si esto es nulo devuelve
                                            una lista vacía**/
        }

    }
}