package com.pedrosaez.ejemplomvvm.data.model

// Clase que nos sirve para obtener las frases
class FrasesProvider {

    // lo ponemos como estático para poder acceder sin necesidad de instanciar la clase
    companion object {


        var quotes:List<FrasesModel> = emptyList()

        //método que devuelve una frase al azar
        /*fun random():FrasesModel {
            val position = (frase.indices).random()
            return frase[position]
        }

        // lista donde guardamos las frases
       private val frase = listOf<FrasesModel>(

            FrasesModel(
                frase = "It’s not a bug. It’s an undocumented feature!",
                autor = "Anonymous"
            ),
            FrasesModel(
                frase = "“Software Developer” – An organism that turns caffeine into software",
                autor = "Anonymous"
            ),
            FrasesModel(
                frase = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                autor = "Edsger Dijkstra"
            ),
            FrasesModel(
                frase = "A user interface is like a joke. If you have to explain it, it’s not that good.",
                autor = "Anonymous"
            ),
            FrasesModel(
                frase = "I don’t care if it works on your machine! We are not shipping your machine!",
                autor = "Vidiu Platon"
            ),
            FrasesModel(
                frase = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
                autor = "Bill Gates"
            ),
            FrasesModel(
                frase = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
                autor = "Anonymous"
            ),
            FrasesModel(frase = "Things aren’t always #000000 and #FFFFFF", autor = "Anonymous"),
            FrasesModel(frase = "Talk is cheap. Show me the code.", autor = "Linus Torvalds"),
            FrasesModel(
                frase = "Software and cathedrals are much the same — first we build them, then we pray.",
                autor = "Anonymous"
            ),
            FrasesModel(frase = "¿A que esperas?, suscríbete.", autor = "AristiDevs")
        )*/
    }
}