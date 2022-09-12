//EXERCÍCIO EXTRA 1) - SOMA DE TODOS OS ÍMPARES MÚLTIPLOS DE 3, DE 1 E 500

fun main() {
    //INICIALIZA A VARIÁVEL DE SOMA FORA DO LOOP
    var soma = 0
    //TÍTULO DO CÓDIGO
    println("- ÍMPARES MÚLTIPLOS DE 3, DE 1 A 500 -")
    //LOOP DE TODOS OS VALORES DE 1 A 500
    for (i in 1..500) {
        //SE NÃO RESTAR 0 NA DIVISÃO POR 2 (ÍMPAR) E RESTAR 0 NA DIVISÃO POR 3 (MÚLTIPLO DE 3)
        if (i % 2 != 0 && i % 3 == 0) {
            println(i)
            soma += i //SOMA TODOS OS VALORES QUE ENTRAREM NA CONDICIONAL
        }//if
    }//for
    print("SOMA TOTAL: $soma") //IMPRIME A SOMA FINAL
}//main