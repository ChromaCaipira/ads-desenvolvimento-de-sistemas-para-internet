package com.oo.project

open class Animal {
    open var nome: String = "" //NOME DO ANIMAL
    open var reprod: String = "" //VIVÍPARO OU OVÍPARO
    open var dieta: String = "" //CARNÍVORO, HERBÍVORO OU ONÍVORO

    open fun fala(nome: String): String { //FUNÇÃO A SER SOBRESCRITA POR SUAS SUBCLASSES
        return "" //RETORNO VAZIO
    }
}