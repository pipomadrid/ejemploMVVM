package com.pedrosaez.ejemplomvvm.data.model

import com.google.gson.annotations.SerializedName
import kotlin.text.Typography.quote


//definimos el modelo de datos a usar, con SerializedName indicamos el nombre de la variable que tiene que corresponder con el nombre del Json
//correspondiente
data class FrasesModel (@SerializedName("quote")val frase:String,@SerializedName("author")val autor:String){
}