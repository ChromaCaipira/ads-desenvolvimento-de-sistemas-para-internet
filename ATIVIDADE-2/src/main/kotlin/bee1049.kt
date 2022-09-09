//"ANIMAL" - Identificar o animal desejado a partir de suas características
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var numEntrada = 0
    //COLETA DE ENTRADA DA ESCOLHA
    println(
        "Vamos encontrar um animal!\n" +
                "Escolha suas características com as opções abaixo:\n" +
                "Digite 1 para Vertebrado\n" +
                "Digite 2 para Invertebrado"
    )
    var entrada = scan.next().toIntOrNull()
    entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
    if (entrada == 1) {
        //VERTEBRADO (1)
        numEntrada = 1
        println(
            "Digite 1 para Ave\n" +
                    "Digite 2 para Mamífero"
        )
        entrada = scan.next().toIntOrNull()
        entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
        if (entrada == 1) {
            //AVE (1 1)
            numEntrada = 2
            println(
                "Digite 1 para Carnívoro\n" +
                        "Digite 2 para Onívoro"
            )
            entrada = scan.next().toIntOrNull()
            entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
            if (entrada == 1) {
                //CARNÍVORO (1 1 1)
                println("Seu animal é: Águia")
            } else {
                //ONÍVORO (1 1 2)
                println("Seu animal é: Pomba")
            }
        } else {
            //MAMÍFERO (1 2)
            numEntrada = 3
            println(
                "Digite 1 para Onívoro\n" +
                        "Digite 2 para Herbívoro"
            )
            entrada = scan.next().toIntOrNull()
            entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
            if (entrada == 1) {
                //ONÍVORO (1 2 1)
                println("Seu animal é: Homem")
            } else {
                //HERBÍVORO (1 2 2)
                println("Seu animal é: Vaca")
            }
        }
    } else { //SE NÃO FOR 1, SÓ TEM COMO SER 2 (CONFORME O SISTEMA ACIMA À PROVA DE ERROS)
        //INVERTEBRADO (2)
        numEntrada = 4
        println(
            "Digite 1 para Inseto\n" +
                    "Digite 2 para Anelídeo"
        )
        entrada = scan.next().toIntOrNull()
        entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
        if (entrada == 1) {
            //INSETO (2 1)
            numEntrada = 5
            println(
                "Digite 1 para Hematófago\n" +
                        "Digite 2 para Herbívoro"
            )
            entrada = scan.next().toIntOrNull()
            entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
            if (entrada == 1) {
                //HEMATÓFAGO (2 1 1)
                println("Seu animal é: Pulga")
            } else {
                //HERBÍVORO (2 1 2)
                println("Seu animal é: Lagarta")
            }
        } else {
            //ANELÍDEO (1 2)
            numEntrada = 6
            println(
                "Digite 1 para Hematófago\n" +
                        "Digite 2 para Onívoro"
            )
            entrada = scan.next().toIntOrNull()
            entrada = checarEntrada(entrada, numEntrada) //CHECAGEM DE ENTRADA VÁLIDA
            if (entrada == 1) {
                //HEMATÓFAGO (2 2 1)
                println("Seu animal é: Sanguessuga")
            } else {
                //ONÍVORO (2 2 2)
                println("Seu animal é: Minhoca")
            }//else do else do else
        }//else do else
    }//else
}//main

fun checarEntrada(entrada: Int?, num: Int): Int { //FUNÇÃO PARA CHECAGEM DE ENTRADA VÁLIDA
    val scan = Scanner(System.`in`)
    var novaEntrada = entrada
    //LOOP QUE REJEITA QUALQUER VALOR NÃO-INTEIRO OU MENOR QUE 1 OU MAIOR QUE 2
    while (novaEntrada == null || novaEntrada < 1 || novaEntrada > 2) {
        println("ERRO: Opção escolhida INEXISTENTE!")
        when (num) {
            0 -> {
                println(
                    "Digite 1 para Vertebrado\n" +
                            "Digite 2 para Invertebrado"
                )
            }

            1 -> {
                println(
                    "Digite 1 para Ave\n" +
                            "Digite 2 para Mamífero"
                )
            }

            2 -> {
                println(
                    "Digite 1 para Carnívoro\n" +
                            "Digite 2 para Onívoro"
                )
            }

            3 -> {
                println(
                    "Digite 1 para Onívoro\n" +
                            "Digite 2 para Herbívoro"
                )
            }

            4 -> {
                println(
                    "Digite 1 para Inseto\n" +
                            "Digite 2 para Anelídeo"
                )
            }

            5 -> {
                println(
                    "Digite 1 para Hematófago\n" +
                            "Digite 2 para Herbívoro"
                )
            }

            6 -> {
                println(
                    "Digite 1 para Hematófago\n" +
                            "Digite 2 para Onívoro"
                )
            }
        }//when
        novaEntrada = scan.next().toIntOrNull()
    }//while
    return novaEntrada
}//checarEntrada