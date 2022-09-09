//"IMPOSTO DE RENDA" - Leia o valor de um salário com duas casas decimais e calcule seu imposto de renda
import java.util.*
import kotlin.math.roundToInt

fun main() {
    val scan = Scanner(System.`in`)
    val imposto: Double
    //COLETA DE VALOR DO SALÁRIO
    println("Insira seu salário:")
    var salario = scan.next().toDoubleOrNull()
    //CHECAGEM DE SALÁRIO INSERIDO VÁLIDO
    while (salario == null || salario < 0) {
        println("ERRO: Salário inserido INVÁLIDO!")
        println("Insira seu salário:")
        salario = scan.next().toDoubleOrNull()
    }
    //CONDICIONAL COM SALÁRIO ARREDONDADO EM 2 CASAS DECIMAIS
    when (val sal = (salario * 100.0).roundToInt() / 100.0) {
        in 0.00..2000.00 -> {
            print("Isento do Imposto de Renda.")
        }

        in 2000.01..3000.00 -> {
            //TAXA É DE 8% DO SALÁRIO, SUBTRAIDO PELO MIN DA FAIXA
            imposto = ((sal - 2000) * 8 / 100)
            print(
                "Taxa do Imposto: R$$imposto\n" +
                        "Percentual: 8%"
            )
        }

        in 3000.01..4500.00 -> {
            //TAXA É DE 18% DO SALÁRIO, SUBTRAIDO PELO MAX DA FAIXA ANTERIOR, SOMADO A 8% DE 1000
            //OS 1000 VEM DA METADE DO MIN DA ANTERIOR
            imposto = (((sal - 3000) * 18 / 100) + (1000 * 8 / 100))
            print(
                "Taxa do Imposto: R$$imposto\n" +
                        "Percentual: 18%"
            )
        }

        else -> { //A PARTIR DE 4500
            //TAXA É DE 28% DO SALÁRIO, SUBTRAIDO PELO MAX DA ANTERIOR, SOMADO A 8% DE 1000 E 18% DE 1500
            //OS 1500 VEM DA METADE DO MIN DA ANTERIOR
            imposto = (((sal - 4500) * 28 / 100) + (1000 * 8 / 100) + (1500 * 18 / 100))
            print(
                "Taxa do Imposto: R$$imposto\n" +
                        "Percentual: 28%"
            )
        }
    }//when
}//main