package com.pedrosaez.ejemplomvvm.domain

import com.pedrosaez.ejemplomvvm.data.FrasesRepositorio
import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import com.pedrosaez.ejemplomvvm.data.model.FrasesProvider

class GetRandomFraseUseCase {

    operator fun invoke():FrasesModel?{
        //obtenemos las listas desde el provider erroneamente pero en la proxima version lo arreglamos
        val frase = FrasesProvider.quotes
        if(!frase.isNullOrEmpty()){

            val randomNumber = (frase.indices).random()
            return frase[randomNumber]
        }
        return null
    }
}