package com.pedrosaez.ejemplomvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pedrosaez.ejemplomvvm.data.model.FrasesModel
import com.pedrosaez.ejemplomvvm.data.model.FrasesProvider
import com.pedrosaez.ejemplomvvm.domain.GetFrasesUseCase
import com.pedrosaez.ejemplomvvm.domain.GetRandomFraseUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//clase para implementar el viewmodel

/*hemos preparado la inyección de dependencias añadiendo la etiqueta @HiltViewModel y
poniendo @Inject contructor() después del nombre de la clase.*/
@HiltViewModel
class FrasesViewModel @Inject constructor(private  val getFrasesUseCase :GetFrasesUseCase,
                                          private val getRandomFraseUseCase :GetRandomFraseUseCase) : ViewModel() {

    //creamos un livedata de tipo frases que será observado desde mainActivity
    val fraseModel = MutableLiveData<FrasesModel>()
    val isLoading = MutableLiveData<Boolean>()


    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true) //aparece la progress bar
            val result = getFrasesUseCase()

            // si el resultado contiene frases pone la primera al crear la app para que aparezca vacía
            if(!result.isNullOrEmpty()){
                fraseModel.postValue(result[0])
                isLoading.postValue(false) // ocultamos progress bar
            }
        }

    }


    //Este método creamos una variable donde guardamos el resultado de llamar al método random de FrasesProvider
    // y se lo pasamos al livedata
    fun fraseRandom() {
        isLoading.postValue(true)
        val frase:FrasesModel? = getRandomFraseUseCase()
        if(frase!=null){
            fraseModel.postValue(frase)
        }
        isLoading.postValue(false)



    }



}