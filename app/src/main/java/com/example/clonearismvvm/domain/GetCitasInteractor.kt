package com.example.clonearismvvm.domain

import com.example.clonearismvvm.data.CitaRepository
import com.example.clonearismvvm.data.model.CitaModel

/**Interactor o Caso de Uso,
 * en dónde se realiza la lógica de negocio**/
class GetCitasInteractor {

    private val repository = CitaRepository()
/**invoke; extremadamente útil para devolver lo solicitado
 * en la capa de UI */
    suspend operator fun invoke():List<CitaModel>? = repository.getAllCitas()

}