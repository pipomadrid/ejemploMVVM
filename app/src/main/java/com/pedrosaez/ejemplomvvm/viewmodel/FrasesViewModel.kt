package com.pedrosaez.ejemplomvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pedrosaez.ejemplomvvm.model.FrasesModel
import com.pedrosaez.ejemplomvvm.model.FrasesProvider

//clase para implementar el viewmodel
class FrasesViewModel : ViewModel() {

    //creamos un livedata de tipo frases que será observado desde mainActivity
    val fraseModel = MutableLiveData<FrasesModel>()


    //Este método creamos una variable donde guardamos el resultado de llamar al método random de FrasesProvider
    // y se lo pasamos al livedata
    fun fraseRandom() {

        val fraseActual: FrasesModel = FrasesProvider.random()
        fraseModel.postValue(fraseActual)

    }

}