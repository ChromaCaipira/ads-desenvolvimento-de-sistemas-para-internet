//EXERCÍCIO EXTRA 7) - TABUADA PARA O VALOR N INSERIDO DE 1 A 10
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //TÍTULO DO CÓDIGO
    println("- TABUADA DE 1 A 10 -")
    //COLETA DO VALOR
    println("Insira um valor de 1 a 10:")
    var valorN = scan.next().toIntOrNull()
    //CHECAGEM DE VALOR INVÁLIDO
    while (valorN == null || valorN < 1 || valorN > 10) {
        println("ERRO: Valor inserido INVÁLIDO!")
        println("Insira um valor de 1 a 10:")
        valorN = scan.next().toIntOrNull()
    }//while
    //EXIBIÇÃO DE RESULTADO
    for (i in 1..10) { //PARA i DE 1 A 10
        //EXIBE A MÚLTIPLICAÇÃO DE 1 A 10 DESTE VALOR, OU SEJA, SUA TABUADA
        println("$valorN * $i = ${valorN * i}")
    }//for
}//main