//"MÚLTIPLOS" - Leia 2 valores inteiros e declare se são múltiplos entre si ou não
import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    //COLETA DO PRIMEIRO INTEIRO
    println("Digite um número inteiro:")
    var num1 = scan.next().toIntOrNull() //TRANSFORMA EM INT OU NULO
    while (num1 == null) { //SE FOR NULO, REPETE A REQUISIÇÃO DE INTEIRO
        println("ERRO: DECLARE UM VALOR INTEIRO!")
        println("Digite um número inteiro:")
        num1 = scan.next().toIntOrNull()
    }
    num1 = num1.toInt() //TRANSFORMA PARA INTEIRO NOVAMENTE (PARA O MAXOF() ACEITAR A VARIÁVEL)
    //COLETA DO SEGUNDO INTEIRO
    println("Digite outro número inteiro:")
    var num2 = scan.next().toIntOrNull() //TRANSFORMA EM INT OU NULO
    while (num2 == null) { //SE FOR NULO, REPETE A REQUISIÇÃO DE INTEIRO
        println("ERRO: DECLARE UM VALOR INTEIRO!")
        println("Digite um número inteiro:")
        num2 = scan.next().toIntOrNull()
    }
    num2 = num2.toInt() //TRANSFORMA PARA INTEIRO NOVAMENTE (PARA O MAXOF() ACEITAR A VARIÁVEL)

    //CHECA QUAL O MAIOR VALOR INSERIDO
    if (maxOf(num1, num2) == num1) { //SE O PRIMEIRO FOR MAIOR..
        if (num1 % num2 == 0) { //..CHECA SE A DIVISÃO DO PRIMEIRO COM O SEGUNDO RESTA ZERO
            println("$num1 e $num2 SÃO múltiplos entre si!")
        } else { //CASO NÃO RESTAR EM ZERO, NÃO SERÃO MÚLTIPLOS
            println("$num1 e $num2 NÃO SÃO múltiplos entre si!")
        }
    } else { //SE O SEGUNDO FOR MAIOR..
        if (num2 % num1 == 0) { //..CHECA SE A DIVISÃO DO SEGUNDO COM O PRIMEIRO RESTA ZERO
            println("$num1 e $num2 SÃO múltiplos entre si!")
        } else { //CASO NÃO RESTAR EM ZERO, NÃO SERÃO MÚLTIPLOS
            println("$num1 e $num2 NÃO SÃO múltiplos entre si!")
        }//else do else
    }//else
}//main