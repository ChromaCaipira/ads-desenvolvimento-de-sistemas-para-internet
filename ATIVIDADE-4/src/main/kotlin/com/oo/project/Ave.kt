package com.oo.project

class Ave(
    override var nome: String,
    override var reprod: String,
    override var dieta: String,
) : Animal() {
    //SOBRESCRITA DA FUNÇÃO DE FALA (POLIMORFISMO)
    override fun fala(nome: String): String {
        //CHECA O NOME DO ANIMAL E, A PARTIR DELE, RETORNA O SOM QUE O TAL EMITE
        when (nome) {
            "Coruja" -> {
                return "Uuh uuh!"
            }

            "Pombo" -> {
                return "Pruu!"
            }
        }//when
        return ""
    }//fun
}//class
