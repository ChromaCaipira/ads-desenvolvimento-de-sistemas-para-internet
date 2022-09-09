//"NÚMEROS ÍMPARES" - Leia um valor X entre 1 e 1000, em seguida mostre os impares de 1 a X, inclusive
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //COLETA DO VALOR X
    println("Insira um valor de 1 a 1000:")
    var valorX = scan.next().toIntOrNull()
    while (valorX == null || valorX < 1 || valorX > 1000) {
        println("ERRO: Valor inserido INVÁLIDO!")
        println("Insira um valor de 1 a 1000:")
        valorX = scan.next().toIntOrNull()
    }
    //LOOP PARA IMPRIMIR TODOS OS VALORES ÍMPARES DE 1 AO VALOR INSERIDO
    for (i in 1..valorX) {
        if (i % 2 != 0) {
            println(i)
        }//if
    }//for
}//main