package com.oo.project

class Mamifero(
    override var nome: String,
    override var reprod: String,
    override var dieta: String,
) : Animal() {
    //SOBRESCRITA DA FUNÇÃO DE FALA (POLIMORFISMO)
    override fun fala(nome: String): String {
        //CHECA O NOME DO ANIMAL E, A PARTIR DELE, RETORNA O SOM QUE O TAL EMITE
        when (nome) {
            "Lobo" -> {
                return "Auuu!"
            }

            "Vaca" -> {
                return "Muuu!"
            }

            "Ornitorrinco" -> {
                return "Crrr!"
            }
        }//when
        return ""
    }//fun
}//class
