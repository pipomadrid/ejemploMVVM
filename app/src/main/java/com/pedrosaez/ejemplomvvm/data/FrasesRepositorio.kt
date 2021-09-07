package com.pedrosaez.ejemplomvvm.data

import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import com.pedrosaez.ejemplomvvm.data.model.FrasesProvider
import com.pedrosaez.ejemplomvvm.data.network.FrasesService
import javax.inject.Inject

class FrasesRepositorio @Inject constructor(private val api :FrasesService){


    // con este método usamos la clase FrasesService para recuperar las frases y pasarlas a la variable quotes de FrasesProvider
    suspend fun getAllFrases(): List<FrasesModel> {

        val response = api.getFrases()
        FrasesProvider.quotes = response
        return response

    }
}