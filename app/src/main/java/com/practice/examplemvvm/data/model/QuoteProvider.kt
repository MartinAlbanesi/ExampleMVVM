package com.practice.examplemvvm.data.model

class QuoteProvider {
    companion object {

        fun random():QuoteModel{
            val position = (0..9).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                "It's not a bug. It's an undocumented feature!",
                "Anonymous"
            ),
            QuoteModel(
                "'Software Developer' - An organism that turns caffeine into software",
                "Anonymous"
            ),
            QuoteModel(
                "If debugging is the process of removing software bugs, then programming must be the process of putting them in",
                "Edsger Dijkstra"
            ),
            QuoteModel(
                "Me encanta la leche en polvo",
                "Osvaldo"
            ),
            QuoteModel(
                "A la grande le puse cuca",
                "Homero Simpson"
            ),
            QuoteModel(
                "Aguante bocaaaaaaaaaaaaa",
                "El negro"
            ),
            QuoteModel(
                "Peron Peron, que grande sos",
                "Argentos"
            ),
            QuoteModel(
                "La wea fome qlia",
                "Chilenos"
            ),
            QuoteModel(
                "Momento mori",
                "ez"
            ),
            QuoteModel(
                "Todas putas",
                "Yo"
            )
        )
    }
}