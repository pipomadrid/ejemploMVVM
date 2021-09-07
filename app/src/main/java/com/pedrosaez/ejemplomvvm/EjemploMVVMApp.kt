package com.pedrosaez.ejemplomvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//clase necesaria para inicializar dagger Hilt

/*
Hay que declararla en AndroidManifest  como clase principal.
Dentro de la llave <application añadiremos el atributo name junto a la ruta de la clase.
Para poder inyectar clases se tienen que dar dos factores. Que la clase donde va a ser inyectada y
la que va a ser inyectada estén preparadas con Dagger Hilt.
 Y esto puede cambiar dependiendo de los tipos

 */
@HiltAndroidApp
class EjemploMVVMApp :Application()