//"NÚMEROS PARES" - Imprima todos os valores pares de 1 a 100, inclusive

fun main() {
    for (i in 1..100) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}