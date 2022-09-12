//EXERCÍCIO EXTRA 8) - LEIA UM VALOR INICIAL A E UMA RAZÃO R, ENTÃO IMPRIMA UMA SEQUÊNCIA P.A. DE 10 VALORES
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //TÍTULO DO CÓDIGO
    println("- SEQUÊNCIA DE PROGRESSÃO ARITMÉTICA -")
    //COLETA DOS VALORES DE A E RAZÃO
    println("Insira um valor inicial:")
    var valorA = scan.next().toDoubleOrNull() //A
    while (valorA == null) { //PREVENÇÃO CONTRA VALORES NÃO-NUMÉRICOS
        println("ERRO: Valor inserido INVÁLIDO!")
        println("Insira um valor númerico inicial:")
        valorA = scan.next().toDoubleOrNull()
    }//while
    println("Insira o valor da razão:") //RAZÃO
    var razao = scan.next().toDoubleOrNull()
    while (razao == null) { //PREVENÇÃO CONTRA VALORES NÃO-NUMÉRICOS
        println("ERRO: Valor inserido INVÁLIDO!")
        println("Insira o valor da razão:") //RAZÃO
        razao = scan.next().toDoubleOrNull()
    }//while

    //EXIBIÇÃO DO RESULTADO
    print("$valorA, ") //VALOR INICIAL
    for (i in 1..10) { //VALOR RELACIONADO À RAZÃO, PROGRESSIVAMENTE
        if (i == 10) { //SE FOR O ÚLTIMO TERMO, NÃO TEM VÍRGULA E ESPAÇO NO FINAL
            print("${valorA + (razao * i)}")
        } else { //CASO CONTRÁRIO, CONTINUA A SEQUÊNCIA DE VALORES
            print("${valorA + (razao * i)}, ")
        }//else
    }//for
}//main