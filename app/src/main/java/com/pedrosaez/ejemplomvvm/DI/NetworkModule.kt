package com.pedrosaez.ejemplomvvm.DI

import com.pedrosaez.ejemplomvvm.data.network.FrasesApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//Objeto necesario para poder inyectar interfaces y librerias externas con dagger hilt
/*
Con la etiqueta @Module le indicamos que nos va a proveer y con @InstallIn indicamos el alcance
de las instancias creadas, en este caso Singleton..... seria alcance de aplicacion, la instancia moriria
al destruir la app
 */
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun provideQuoteApiClient(retrofit: Retrofit):FrasesApiClient{
        return retrofit.create(FrasesApiClient::class.java)
    }

}