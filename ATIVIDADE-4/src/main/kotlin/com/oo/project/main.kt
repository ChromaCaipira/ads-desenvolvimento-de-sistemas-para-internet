package com.oo.project

import java.util.*

fun main() {
    //DECLARAÇÃO DO SCANNER
    val scan = Scanner(System.`in`)
    //OBJETOS DOS MAMÍFEROS
    val lobo = Mamifero("Lobo", "Vivíparo", "Carnívoro")
    val vaca = Mamifero("Vaca", "Vivíparo", "Herbívoro")
    val ornitorrinco = Mamifero("Ornitorrinco", "Ovíparo", "Carnívoro")
    //OBJETOS DAS AVES
    val coruja = Ave("Coruja", "Ovíparo", "Carnívoro")
    val pombo = Ave("Pombo", "Ovíparo", "Herbívoro")
    //APRESENTAÇÃO DO SISTEMA E COLETA DE DADOS
    println(
        "Bem vindo ao Zoológico de Animais Excêntricos!\n" +
                "Aqui você verá alguns animais que não tenha visto em outros zoológicos!\n" +
                "(Por pura preguiça do programador de pesquisar animais que combinem com a proposta)"
    )
    println(
        "\nQuer checar a ala dos mamíferos ou das aves?\n" +
                "Digite 1 para mamífero ou 2 para ave:"
    )
    var entrada = scan.next().toIntOrNull()
    //CHECA SE ENTRADA É VÁLIDA CONFORME AS OPÇÕES DADAS (APENAS NÚMERO INTEIRO, QUE SEJA 1 OU 2)
    while (entrada == null || entrada < 1 || entrada > 2) {
        println("ERRO: Valor de entrada INVÁLIDO!")
        println(
            "Quer checar a ala dos mamíferos ou das aves?\n" +
                    "Digite 1 para mamífero ou 2 para ave:"
        )
        entrada = scan.next().toIntOrNull()
    }
    //CHECAGEM DA OPÇÃO INSERIDA PARA APLICAÇÃO DE SEUS DEVIDOS MÉTODOS
    when (entrada) {
        1 -> { //MAMÍFERO
            println(
                "O animal que procura é:\n" +
                        "1 para Lobo, 2 para Vaca ou 3 para Ornitorrinco:"
            )
            entrada = scan.next().toIntOrNull()
            //CHECA SE ENTRADA É VÁLIDA CONFORME AS OPÇÕES DADAS (APENAS NÚMERO INTEIRO, QUE SEJA 1 OU 2)
            while (entrada == null || entrada < 1 || entrada > 3) {
                println("ERRO: Valor de entrada INVÁLIDO!")
                println(
                    "O animal que procura é:\n" +
                            "1 para Lobo, 2 para Vaca ou 3 para Ornitorrinco:"
                )
                entrada = scan.next().toIntOrNull()
            }
            when (entrada) {
                1 -> { //LOBO
                    //EXECUTA O MÉTODO DO OBJETO E SALVA PARA USO FUTURO
                    val uivo = lobo.fala(lobo.nome)
                    println("\nAo se aproximar das feras, uma delas uiva assim para você: $uivo")
                    println("O ${lobo.nome} é um mamífero ${lobo.reprod} e ${lobo.dieta}")
                }

                2 -> { //VACA
                    //EXECUTA O MÉTODO DO OBJETO E SALVA PARA USO FUTURO
                    val mugir = vaca.fala(vaca.nome)
                    println("\nAo se aproximar do gado, um deles muge assim para você: $mugir")
                    println("A ${vaca.nome} é um mamífero ${vaca.reprod} e ${vaca.dieta}")
                }

                3 -> { //ORNITORRINCO
                    //PELA FALTA DE NOME PRO BARULHO DO ORNITORRINCO, SERÁ PERRY O NOME DO SEU BARULHO
                    //EXECUTA O MÉTODO DO OBJETO E SALVA PARA USO FUTURO
                    val perry = ornitorrinco.fala(ornitorrinco.nome)
                    println("\nAo se aproximar dos seres estranhos, um deles faz assim para você: $perry")
                    println(
                        "O ${ornitorrinco.nome} é, incrivelmente, um mamífero ${ornitorrinco.reprod} " +
                                "e ${ornitorrinco.dieta}"
                    )
                }
            }//when dentro do when 1
        }//entrada do when 1
        2 -> { //AVE
            println(
                "O animal que procura é:\n" +
                        "1 para Coruja ou 2 para Pombo:"
            )
            entrada = scan.next().toIntOrNull()
            //CHECA SE ENTRADA É VÁLIDA CONFORME AS OPÇÕES DADAS (APENAS NÚMERO INTEIRO, QUE SEJA 1 OU 2)
            while (entrada == null || entrada < 1 || entrada > 2) {
                println("ERRO: Valor de entrada INVÁLIDO!")
                println(
                    "O animal que procura é:\n" +
                            "1 para Coruja ou 2 para Pombo:"
                )
                entrada = scan.next().toIntOrNull()
            }
            when (entrada) {
                1 -> { //CORUJA
                    //EXECUTA O MÉTODO DO OBJETO E SALVA PARA USO FUTURO
                    val chirria = coruja.fala(coruja.nome)
                    println("\nAo se aproximar das quietas aves, uma delas chirria assim para você: $chirria")
                    println("O ${coruja.nome} é um mamífero ${coruja.reprod} e ${coruja.dieta}")
                }

                2 -> { //POMBO
                    //EXECUTA O MÉTODO DO OBJETO E SALVA PARA USO FUTURO
                    val arrulha = pombo.fala(pombo.nome)
                    println("\nAo se aproximar dos ratos voadores, um deles arrulha assim para você: $arrulha")
                    println("A ${pombo.nome} é um mamífero ${pombo.reprod} e ${pombo.dieta}")
                }
            }//when dentro do when 2
        }//entrada do when 2
    }//when
}//main
