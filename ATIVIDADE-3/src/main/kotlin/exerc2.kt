//EXERCÍCIO EXTRA 2) - LEIA 15 VALORES DE ALTURA E IMPRIMA A MENOR E MAIOR ALTURA INSERIDAS
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val alturas: MutableList<String> = mutableListOf() //LISTA MUTÁVEL
    //TÍTULO DO CÓDIGO
    println("- MENOR E MAIOR ALTURA -")
    for (i in 1..15) { //LOOP DE 1 A 15 REPETIÇÕES
        //COLETA DE DADOS
        println("Insira uma altura, em metros ($i/15):")
        var entrada = scan.next().toDoubleOrNull()
        //CHECAGEM DE ALTURA VÁLIDA..
        while (entrada == null || entrada <= 0.0) { //..PARA VALORES NULOS OU MENORES QUE ZERO
            println("ERRO: Altura inserida INVÁLIDA!")
            println("Insira uma altura, em metros ($i/15):")
            entrada = scan.next().toDoubleOrNull()
        }
        while (entrada!! > 2.74) { //..PARA VALORES MAIORES QUE A ALTURA DA MAIS ALTA PESSOA DA HISTÓRIA
            //PREVINE ALTURAS EXORBITANTES FICTÍCIAS E DÁ EM TROCA UMA CURIOSIDADE PARA QUEM TENTAR ULTRAPASSAR
            println(
                "Robert Wadlow foi a pessoa mais alta da história e media 2,74m de altura.\n" +
                        "Não há registros que passem do seu recorde, até então."
            )
            println("Logo: Altura inserida INVÁLIDA!")
            println("Insira uma altura, em metros ($i/15):")
            entrada = scan.next().toDoubleOrNull()
        }
        //TRANSFERE O VALOR INSERIDO PARA STRING
        alturas.add(entrada.toString())
    }
    //COLETA O MENOR E MAIOR VALOR DA LISTA DE ALTURAS
    val menorAltura = alturas.min()
    val maiorAltura = alturas.max()
    //EXIBIÇÃO DO RESULTADO
    print(
        "Menor altura do grupo: $menorAltura\n" +
                "Maior altura do grupo: $maiorAltura"
    )
}