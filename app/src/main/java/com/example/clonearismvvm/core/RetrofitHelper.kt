package com.example.clonearismvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/** pensando en clean arquitechture es que se instancia
 * retrofit desde este fichero Helper
 */
object RetrofitHelper {
    fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}