package com.pedrosaez.ejemplomvvm.data.network

import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import retrofit2.Response
import retrofit2.http.GET

interface FrasesApiClient {
    @GET("/.json")
    suspend fun getAllFrases(): Response<List<FrasesModel>>
}