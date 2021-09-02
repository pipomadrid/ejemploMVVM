package com.pedrosaez.ejemplomvvm.data.network

import com.pedrosaez.ejemplomvvm.core.RetrofitHelper
import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class FrasesService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getFrases(): List<FrasesModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(FrasesApiClient::class.java).getAllFrases()
            response.body() ?: emptyList()
        }

    }
}