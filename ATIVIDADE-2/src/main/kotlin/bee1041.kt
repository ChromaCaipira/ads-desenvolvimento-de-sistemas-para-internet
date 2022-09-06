//"COORDENADAS DE UM PONTO" - Leia 2 valores com uma casa decimal (x e y) e determine o quadrante desse ponto
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    println("Onde o ponto está no eixo X?")
    var x = scan.next().toDoubleOrNull()
    while (x == null) {
        println("Onde o ponto está no eixo X?")
        x = scan.next().toDoubleOrNull()
    }
    println("Onde o ponto está no eixo Y?")
    var y = scan.next().toDoubleOrNull()
    while (y == null) {
        println("Onde o ponto está no eixo Y?")
        y = scan.next().toDoubleOrNull()
    }

    when {
        //NA ORIGEM
        (x == 0.0 && y == 0.0) -> { //ORIGEM
            println("Ponto está na Origem")
        }
        //NO QUADRANTE
        (x >= 0.1 && y >= 0.1) -> { //AMBOS POSITIVOS (Q1)
            println("Ponto está quadrante 1")
        }

        (x <= 0.1 && y >= 0.1) -> { //X NEGATIVO E Y POSITIVO (Q2)
            println("Ponto está quadrante 2")
        }

        (x <= 0.1 && y <= 0.1) -> { //AMBOS NEGATIVOS (Q3)
            println("Ponto está quadrante 3")
        }

        (x >= 0.1 && y <= 0.1) -> { //X POSITIVO E Y NEGATIVO (Q4)
            println("Ponto está quadrante 4")
        }
        //NO EIXO
        ((y != 0.0) && (x == 0.0)) -> { //Y DIFERE DE 0 E X ESTÁ NA SUA ORIGEM
            println("Ponto está no eixo X")
        }

        ((x != 0.0) && (y == 0.0)) -> { //X DIFERE DE 0 E Y ESTÁ NA SUA ORIGEM
            println("Ponto está no eixo Y")
        }
    }
}//main