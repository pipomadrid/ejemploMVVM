package com.pedrosaez.ejemplomvvm.data.network

import com.pedrosaez.ejemplomvvm.core.RetrofitHelper
import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create
import javax.inject.Inject

class FrasesService @Inject constructor(private val api:FrasesApiClient){

    //con este metodo recuperamos la lista de frases de la api usando retrofit y la interfaz ApiClient y su método getAllFrases
    suspend fun getFrases(): List<FrasesModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getAllFrases()
            response.body() ?: emptyList()  // si el response está vacio devuelve lista vacia
        }

    }
}