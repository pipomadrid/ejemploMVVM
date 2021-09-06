package com.pedrosaez.ejemplomvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


//Lo creamos en un objeto para no tener que crear una clase con companion object y simplificar código
object RetrofitHelper {


    //Con este metodo devolvemos un objeto retrofit con la base url, será instanciado en la clase FrasesServices con
    // desde la cual realizaremos la peticiones correspondientes creadas en la interfaz frasesApiClient
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}