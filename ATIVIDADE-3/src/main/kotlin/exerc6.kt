//EXERCÍCIO EXTRA 6) - GERAR NÚMEROS ÍMPARES ENTRE 100 E 200

fun main() {
    //TÍTULO DO CÓDIGO
    println("- NÚMEROS ÍMPARES DE 100 A 200 -")
    for (i in 100..200) { //PARA i DE 100 A 200
        if (i % 2 != 0) { //IMPRIMA O VALOR, CASO SUA DIVISÃO EM 2 NÃO RESTE 0
            println(i)
        }//if
    }//for
}//main