package com.pedrosaez.ejemplomvvm.domain

import com.pedrosaez.ejemplomvvm.data.FrasesRepositorio
import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import javax.inject.Inject

class GetFrasesUseCase @Inject constructor(private val repository :FrasesRepositorio) {


    //cuando especifica un operador de invocación en una clase,
    //se puede llamar en cualquier instancia de la clase sin un nombre de método.
    suspend operator fun invoke():List<FrasesModel>? = repository.getAllFrases()

}

