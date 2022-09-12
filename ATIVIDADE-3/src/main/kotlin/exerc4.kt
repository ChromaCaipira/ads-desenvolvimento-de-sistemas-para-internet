//EXERCÍCIO EXTRA 4) - LEIA DIVERSOS VALORES E CONTE QUANTOS ESTÃO EM DETERMINADOS INTERVALOS, PARAR EM NEGATIVOS
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val valores = mutableListOf<Double>() //LISTA MUTÁVEL DE DOUBLE
    var entrada: Double? //ENTRADA PODE SER DOUBLE OU NULA
    var intervalo1 = 0 //INTERVALO DE VALORES ENTRE 0 E 25
    var intervalo2 = 0 //INTERVALO DE VALORES ENTRE 26 E 50
    var intervalo3 = 0 //INTERVALO DE VALORES ENTRE 51 E 75
    var intervalo4 = 0 //INTERVALO DE VALORES ENTRE 76 E 100
    //TÍTULO DO CÓDIGO
    println("- VALORES EM INTERVALOS -")
    //LOOP "ETERNO" ATÉ SER QUEBRADO
    while (true) {
        println(
            "Insira um número de UM A CEM para a lista\n" +
                    "(digite qualquer número NEGATIVO para FINALIZAR)"
        )
        entrada = scan.next().toDoubleOrNull()
        while (entrada == null || entrada > 100) { //ENQUANTO ENTRAR VALOR NÃO-NUMERAL, ALERTARÁ ERRO
            println("ERRO: Valor inserido INVÁLIDO")
            println(
                "Insira um número de UM A CEM para a lista\n" +
                        "(digite qualquer número NEGATIVO para FINALIZAR)"
            )
            entrada = scan.next().toDoubleOrNull()
        }//while
        when {
            entrada < 0.0 -> {
                break //QUEBRA O LOOP, CASO UM VALOR NEGATIVO SEJA INSERIDO
            }//null
        }//when
        //SE O VALOR NÃO FOR BARRADO PELAS CONDIÇÕES ANTERIORES, ENTRARÁ NA LISTA
        valores.add(entrada)
    }//while
    //TRANSFERE O TAMANHO (SIZE) DA LISTA DE VALORES A UMA VARIÁVEL
    val qntdValores = valores.size
    //CONTADOR DE NÚMEROS EM CADA INTERVALO
    for (i in 0 until qntdValores) {
        when (valores[i]) { //QUANDO O VALOR NO ÍNDICE ATUAL ESTIVER EM DETERMINADO INTERVALO:
            in 0.0..25.0 -> {
                intervalo1++ //INTERVALO DE VALORES ENTRE 0 E 25
            }

            in 26.0..50.0 -> {
                intervalo2++ //INTERVALO DE VALORES ENTRE 26 E 50
            }

            in 51.0..75.0 -> {
                intervalo3++ //INTERVALO DE VALORES ENTRE 51 E 75
            }

            in 76.0..100.0 -> {
                intervalo4++ //INTERVALO DE VALORES ENTRE 76 E 100
            }//in
        }//when
    }//for

    print(
        "Quantidade de números entre:\n" +
                "0-25: $intervalo1\n" +
                "26-50: $intervalo2\n" +
                "51-75 $intervalo3\n" +
                "76-100: $intervalo4"
    )
}//main