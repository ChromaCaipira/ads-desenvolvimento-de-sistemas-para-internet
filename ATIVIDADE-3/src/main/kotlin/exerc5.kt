//EXERCÍCIO EXTRA 5) - LEIA DIVERSOS VALORES POSITIVOS, CALCULE SUA MÉDIA DE TODOS OS VALORES E DOS PARES
//E QUANTIDADE DE VALORES PARES E VALORES IMPARES. ENCERRA QUANDO ENTRA ZERO.
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val valores = mutableListOf<Double>() //LISTA MUTÁVEL DE DOUBLE
    var entrada: Double? //ENTRADA PODE SER DOUBLE OU NULA
    //TÍTULO DO CÓDIGO
    println("- PARES E ÍMPARES -")
    //LOOP "ETERNO" ATÉ SER QUEBRADO
    while (true) {
        println(
            "Insira um valor POSITIVO para a lista\n" +
                    "(digite ZERO para FINALIZAR)"
        )
        entrada = scan.next().toDoubleOrNull()
        while (entrada == null || entrada < 0) {
            println("ERRO: Valor inserido INVÁLIDO!")
            println(
                "Insira um valor POSITIVO para a lista\n" +
                        "(digite ZERO para FINALIZAR)"
            )
            entrada = scan.next().toDoubleOrNull()
        }
        when (entrada) {
            0.0 -> {
                break //QUEBRA O LOOP, CASO UM ZERO SEJA INSERIDO
            }//null
        }//when
        //SE O VALOR NÃO FOR BARRADO PELAS CONDIÇÕES ANTERIORES, ENTRARÁ NA LISTA
        valores.add(entrada)
    }//while

    //TRANSFERE O TAMANHO (SIZE) DA LISTA DE VALORES A UMA VARIÁVEL
    val qntdValores = valores.size
    var soma = 0.0
    //LOOP PARA SOMAR CADA VALOR ENTRE SI (DO ÍNDICE ZERO AO ÚLTIMO)
    for (i in 0 until qntdValores) {
        soma += valores[i]
    }
    //FAZ A MÉDIA A PARTIR DA SOMA SOBRE A QUANTIDADE DE VALORES
    val mediaLista = soma / qntdValores

    //LISTA DE VALORES PARES E IMPARES
    val valoresPares = valores.filter { it % 2 == 0.0 }
    val valoresImpares = valores.filter { it % 2 != 0.0 }
    //QUANTIDADE DE PARES E IMPARES
    val qntdPares = valoresPares.size
    val qntdImpares = valoresImpares.size
    //LOOP PARA SOMAR CADA VALOR ENTRE SI (DO ÍNDICE ZERO AO ÚLTIMO)
    for (i in 0 until qntdPares) {
        soma += valores[i]
    }
    //FAZ A MÉDIA A PARTIR DA SOMA SOBRE A QUANTIDADE DE VALORES PARES
    val mediaPares = soma / qntdPares

    print(
        "Média dos valores: $mediaLista\n" +
                "Valores PARES: $valoresPares\n" +
                "Quantidade de PARES: $qntdPares\n" +
                "Média dos PARES: $mediaPares\n" +
                "Valores IMPARES: $valoresImpares\n" +
                "Quantidade de IMPARES: $qntdImpares"
    )
}