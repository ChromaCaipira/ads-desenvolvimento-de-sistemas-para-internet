//"LANCHE" - Sistema de anotação de pedido
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //VALOR DA CONTA A PAGAR
    var conta = 0.0
    //CONTEÚDO DO MENU
    val item1 = "Cachorro Quente"
    val item2 = "X-Salada"
    val item3 = "X-Bacon"
    val item4 = "Torrada simples"
    val item5 = "Refrigerante"
    //PREÇO DOS ITENS
    val preco1 = 4.00
    val preco2 = 4.50
    val preco3 = 5.00
    val preco4 = 2.00
    val preco5 = 1.50
    //QUANTIDADES INSERIDAS DE CADA ITEM ENUMERADAS
    var qntd1 = 0
    var qntd2 = 0
    var qntd3 = 0
    var qntd4 = 0
    var qntd5 = 0

    println("Bem-vindo ao restaurante CHROMA! Faça seu pedido a seguir:")
    println(
        "Digite 1 para $item1, \n" +
                "Digite 2 para $item2, \n" +
                "Digite 3 para $item3, \n" +
                "Digite 4 para $item4, \n" +
                "Digite 5 para $item5, \n" +
                "Digite qualquer outro valor para finalizar"
    )
    var entrada = scan.nextLine().toIntOrNull() //SE CASO O VALOR INSERIDO NÃO PUDER SER INT, TORNARÁ NULO
    //ENQUANTO O VALOR INSERIDO FOR UM ITEM DA LISTA, SERÁ ADICIONADO À CONTA FINAL
    while (entrada == 1 || entrada == 2 || entrada == 3 || entrada == 4 || entrada == 5) {
        when (entrada) {
            1 -> {
                qntd1++ //ADICIONA 1 À QUANTIDADE DAQUELE ITEM
                conta += preco1 //ADICIONA O PREÇO DO ITEM À CONTA
                entrada - 1 //ENTRADA RETORNA AO VALOR INICIAL
            }

            2 -> {
                qntd2++ //ADICIONA 1 À QUANTIDADE DAQUELE ITEM
                conta += preco2 //ADICIONA O PREÇO DO ITEM À CONTA
                entrada - 2 //ENTRADA RETORNA AO VALOR INICIAL
            }

            3 -> {
                qntd3++ //ADICIONA 1 À QUANTIDADE DAQUELE ITEM
                conta += preco3 //ADICIONA O PREÇO DO ITEM À CONTA
                entrada - 3 //ENTRADA RETORNA AO VALOR INICIAL
            }

            4 -> {
                qntd4++ //ADICIONA 1 À QUANTIDADE DAQUELE ITEM
                conta += preco4 //ADICIONA O PREÇO DO ITEM À CONTA
                entrada - 4 //ENTRADA RETORNA AO VALOR INICIAL
            }

            5 -> {
                qntd5++ //ADICIONA 1 À QUANTIDADE DAQUELE ITEM
                conta += preco5 //ADICIONA O PREÇO DO ITEM À CONTA
                entrada - 5 //ENTRADA RETORNA AO VALOR INICIAL
            }
        }//when
        //PERGUNTA NOVAMENTE O ITEM A SER INSERIDO À CONTA
        println(
            "Digite 1 para $item1, \n" +
                    "Digite 2 para $item2, \n" +
                    "Digite 3 para $item3, \n" +
                    "Digite 4 para $item4, \n" +
                    "Digite 5 para $item5, \n" +
                    "Digite qualquer outro valor para finalizar"
        )
        entrada = scan.nextLine().toIntOrNull() //SE CASO O VALOR INSERIDO NÃO PUDER SER INT, TORNARÁ NULO
    }//while
    println(
        "Seu pedido foi: \n" +
                "QNTD - ITEM - PREÇO \n" +
                "$qntd1 - $item1 - R$ $preco1 \n" +
                "$qntd2 - $item2 - R$ $preco2  \n" +
                "$qntd3 - $item3 - R$ $preco3  \n" +
                "$qntd4 - $item4 - R$ $preco4  \n" +
                "$qntd5 - $item5 - R$ $preco5  \n"
    )
    println("Total: R$ $conta")
}//main
