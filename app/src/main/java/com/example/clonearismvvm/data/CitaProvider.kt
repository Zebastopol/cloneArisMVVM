package com.example.clonearismvvm.data

import com.example.clonearismvvm.data.model.CitaModel

class CitaProvider {
    companion object {

        fun aleatorio(): CitaModel {
        /** el método será del tipo del modelado de datos
         * "data class" **/
            val posicion:Int = (0..10).random()
            /** y por medio de una variable Int
             * devolverá una posición al azar ".random()"
             * dentro del listado **/
            return cita[posicion]
            /** retornando de la variable de la lista,
             *  una posición determinada **/
        }

      private val cita = listOf<CitaModel>(
        CitaModel(
            cita = "It’s not a bug. It’s an undocumented feature!",
            autor = "Anonymous"
        ),
        CitaModel(
            cita = "“Software Developer” – An organism that turns caffeine into software",
            autor = "Anonymous"
        ),
        CitaModel(
            cita = "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
            autor = "Edsger Dijkstra"
        ),
        CitaModel(
            cita = "A user interface is like a joke. If you have to explain it, it’s not that good.",
            autor = "Anonymous"
        ),
        CitaModel(
            cita = "I don’t care if it works on your machine! We are not shipping your machine!",
            autor = "Vidiu Platon"
        ),
        CitaModel(
            cita = "Measuring programming progress by lines of code is like measuring aircraft building progress by weight.",
            autor = "Bill Gates"
        ),
        CitaModel(
            cita = "My code DOESN’T work, I have no idea why. My code WORKS, I have no idea why.",
            autor = "Anonymous"
        ),
        CitaModel(cita = "Things aren’t always #000000 and #FFFFFF", autor = "Anonymous"),
        CitaModel(cita = "Talk is cheap. Show me the code.", autor = "Linus Torvalds"),
        CitaModel(
            cita = "Software and cathedrals are much the same — first we build them, then we pray.",
            autor = "Anonymous"
        ),
        CitaModel(cita = "¿A que esperas?, suscríbete.", autor = "AristiDevs")
        )
    }
}