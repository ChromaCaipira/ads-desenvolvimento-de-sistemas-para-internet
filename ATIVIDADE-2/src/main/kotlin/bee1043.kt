//"TRIÂNGULO" - Verificar pelos 3 valores inseridos se eles formam um triângulo ou não
//..e calcular o perímetro do triângulo, em caso positivo, ou calcular a área do trapézio, em caso negativo.
import java.util.*

var valor1 = 0.0
var valor2 = 0.0
var valor3 = 0.0
var resultado = 0.0

fun main() {
    val scan = Scanner(System.`in`)
    for (i in 1..3) {
        println("Insira o ${i}º valor do polígono (utilize ponto para decimais):")
        var entrada = scan.next().toDoubleOrNull()
        while (entrada == null) {
            println("Insira o ${i}º valor do polígono (utilize ponto para decimais):")
            entrada = scan.next().toDoubleOrNull()
        }
        when (i) {
            1 -> {
                valor1 += entrada //VALOR OBTÉM RESULTADO DA ENTRADA
                entrada -= valor1 //ENTRADA ABSTRAI VALOR RECEBIDO
            }

            2 -> {
                valor2 += entrada //VALOR OBTÉM RESULTADO DA ENTRADA
                entrada -= valor2 //ENTRADA ABSTRAI VALOR RECEBIDO
            }

            3 -> {
                valor3 += entrada //VALOR OBTÉM RESULTADO DA ENTRADA
                entrada -= valor3 //ENTRADA ABSTRAI VALOR RECEBIDO
            }
        }//when
    }//for

    //SE CADA VALOR FOR MENOR QUE A SOMA DOS VALORES RESTANTES, SERÁ UM TRIÂNGULO
    if ((valor1 < valor2 + valor3) && (valor2 < valor1 + valor3) && (valor3 < valor2 + valor1)) {
        //TRIÂNGULO: SOMA DOS LADOS
        resultado = valor1 + valor2 + valor3
        println("Perímetro = $resultado")
    } else { //CASO CONTRÁRIO, SERÁ UM TRAPÉZIO
        //TRAPÉZIO: MEIO (1/2) MULTIPLICADO À SOMA DOS LADOS PARALELOS MULTIPLICADO À ALTURA
        resultado = 0.5 * (valor1 + valor2) * valor3
        println("Área = $resultado")
    }

}//main