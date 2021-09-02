package com.pedrosaez.ejemplomvvm.data.model

import com.google.gson.annotations.SerializedName
import kotlin.text.Typography.quote


//definimos el modelo de datos a usar
data class FrasesModel (@SerializedName("quote")val frase:String,@SerializedName("author")val autor:String){
}