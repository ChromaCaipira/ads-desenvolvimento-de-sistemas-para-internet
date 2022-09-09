//"AUMENTO DE SALÁRIO" - Lê um valor inicial de salário e dá um aumento (em %) correspondente ao seu valor
import java.util.*
import kotlin.math.roundToInt

fun main() {
    val scan = Scanner(System.`in`)
    var aumento = 0.0
    var percentual = 0
    //COLETA DO VALOR DO SALÁRIO
    println("Insira seu salário:")
    var salario = scan.next().toDoubleOrNull()
    while (salario == null || salario < 0.0) { //PREVENÇÃO DE ENTRADA INVÁLIDA
        println("ERRO: Valor de Salário INVÁLIDO!")
        println("Insira seu salário:")
        salario = scan.next().toDoubleOrNull()
    }
    //SALÁRIO ARREDONDADO EM 2 CASAS DECIMAIS
    var sal = (salario * 100.0).roundToInt() / 100.0

    when { //QUANDO O SALÁRIO FOR:
        sal in 0.00..400.00 -> { //ENTRE 0 E 400
            percentual = 15
            aumento = sal * percentual / 100
            sal += aumento
        }

        sal in 400.01..800.00 -> { //ENTRE 400.01 E 800
            percentual = 12
            aumento = sal * percentual / 100
            sal += aumento
        }

        sal in 800.01..1200.00 -> { //ENTRE 800.01 e 1200
            percentual = 10
            aumento = sal * percentual / 100
            sal += aumento
        }

        sal in 1200.01..2000.00 -> { //ENTRE 1200.01 E 2000
            percentual = 7
            aumento = sal * percentual / 100
            sal += aumento
        }

        sal > 2000.00 -> { //MAIOR QUE 2000
            percentual = 4
            aumento = sal * percentual / 100
            sal += aumento
        }
    }//when
    println(
        "Novo salário: R$$sal \n" +
                "Reajuste ganho: +$aumento \n" +
                "Percentual: ${percentual}%"
    )
}//main