//EXERCÍCIO EXTRA 10) - LEIA A E IMPRIMA A SEQUÊNCIA DE VALORES DO CÁLCULO DE A! (FATORIAL)
//EX: 5! = 5 X 4 X 3 X 2 X 1 = 120
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var resultado = 1
    //TÍTULO DO CÓDIGO
    println("- SEQUÊNCIA FATORIAL -")
    //COLETA DO VALOR
    println("Insira um número INTEIRO POSITIVO:")
    var valor = scan.next().toIntOrNull()
    while (valor == null || valor < 0) { //PREVENÇÃO CONTRA VALORES "NÃO-INTEIROS" OU NEGATIVOS
        println("ERRO: Valor inserido INVÁLIDO!")
        println("Insira um número INTEIRO POSITIVO:")
        valor = scan.next().toIntOrNull()
    }
    if (valor == 0) { //PREVENÇÃO CONTRA ZERO FATORIAL
        println("0! = 1") //ZERO FATORIAL DÁ UM
    } else {
        //CÁLCULO DE FATORIAL
        for (i in 1..valor) {
            resultado *= i
        }
        //EXIBIÇÃO DA SEQUÊNCIA PARA FORMAR O RESULTADO
        for (i in 1..valor) {
            if (i == valor) { //SE CHEGAR NO ÚLTIMO VALOR, IMPRIME APENAS i SEM O SÍMBOLO DE MULTIPLICAÇÃO
                print(i)
            } else { //CASO CONTRÁRIO, IMPRIME i COM O SÍMBOLO DE MULTIPLICAÇÃO
                print("$i X ")
            }//else
        }//for
        print(" = $resultado")
    }
}