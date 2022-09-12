//EXERCÍCIO EXTRA 3) - LEIA DIVERSOS VALORES, CALCULE SUA MÉDIA, QNTD DE POSITIVOS E NEGATIVOS (E PERCENTUAL)
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val valores = mutableListOf<Double>() //LISTA MUTÁVEL DE DOUBLE
    var entrada: Double? //ENTRADA PODE SER DOUBLE OU NULA
    //TÍTULO DO CÓDIGO
    println("- POSITIVOS E NEGATIVOS -")
    //LOOP "ETERNO" ATÉ SER QUEBRADO
    while (true) {
        println(
            "Insira um valor NUMÉRICO para a lista\n" +
                    "(digite QUALQUER OUTRA COISA para FINALIZAR)"
        )
        entrada = scan.next().toDoubleOrNull()
        when (entrada) {
            null -> {
                break //QUEBRA O LOOP, CASO UM VALOR NÃO-NUMÉRICO SEJA INSERIDO
            }//null
        }//when
        if (entrada != null) { //SE O VALOR FOR NÚMERICO, SERÁ ADICIONADO À LISTA
            valores.add(entrada)
        }
    }//while

    //TRANSFERE O TAMANHO (SIZE) DA LISTA DE VALORES A UMA VARIÁVEL
    val qntdValores = valores.size
    var soma = 0.0
    for (i in 0 until qntdValores) {
        //SOMA CADA VALOR ENTRE SI (DO ÍNDICE ZERO AO ÚLTIMO)
        soma += valores[i]
    }
    //FAZ A MÉDIA A PARTIR DA SOMA SOBRE A QUANTIDADE DE VALORES
    val mediaLista = soma / qntdValores

    //LISTA DE VALORES POSITIVOS E NEGATIVOS
    val valoresPositivos = valores.filter { it > 0.0 }
    val valoresNegativos = valores.filter { it < 0.0 }
    //QUANTIDADE DE POSITIVOS E NEGATIVOS
    val qntdPositivos = valoresPositivos.size
    val qntdNegativos = valoresNegativos.size
    //PORCENTAGEM DE POSITIVOS E NEGATIVOS:
    //TRANSFERE A QUANTIDADE DE POS. OU NEG. PARA DOUBLE, PARA ACEITAR DECIMAL NA DIVISÃO COM O TOTAL DE VALORES
    //ENTÃO MULTIPLICA POR 100 PARA OBTER O VALOR DA PORCENTAGEM (VALORPORCENTAGEM/100 = RESULTADO DA DIVISÃO)
    val porcPositivos = (qntdPositivos.toDouble() / qntdValores) * 100
    val porcNegativos = (qntdNegativos.toDouble() / qntdValores) * 100

    //EXIBIÇÃO DOS RESULTADOS
    print(
        "Média dos valores: $mediaLista\n" +
                "Valores Positivos: $valoresPositivos\n" +
                "Quantidade de Positivos: $qntdPositivos\n" +
                "Positivos, em porcentagem: ${porcPositivos}%\n" +
                "Valores Negativos: $valoresNegativos\n" +
                "Quantidade de Negativos: $qntdNegativos\n" +
                "Negativos, em porcentagem: ${porcNegativos}%"
    )
}//main