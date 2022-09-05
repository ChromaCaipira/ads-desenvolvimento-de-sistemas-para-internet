//"MEDIA 3" - Média ponderada de 4 notas e média de recuperação
import java.util.*
import kotlin.math.roundToInt

fun main() {
    val scan = Scanner(System.`in`)
    var notas = 0.0

    //COLETA DE NOTAS
    for (i in 1..4) {
        //PERGUNTA QUAL A NOTA, EM ORDEM DA 1ª A 4ª
        println("Qual a ${i}ª nota? (use vírgula para decimais)")
        var entrada = scan.nextDouble()
        while ((entrada < 0) || (entrada > 10)) { //CHECAGEM DE NOTA VÁLIDA
            println("Valor de nota incorreto! (De preferência, de 0 a 10")
            println("Qual a ${i}ª nota? (use vírgula para decimais)")
            entrada = scan.nextDouble()
        }
        when (i) {
            1 -> { //A PRIMEIRA NOTA TEM PESO 2
                entrada *= 2
            }

            2 -> { //A SEGUNDA NOTA TEM PESO 3
                entrada *= 3
            }

            3 -> { //A TERCEIRA NOTA TEM PESO 4
                entrada *= 4
            }
        }
        //APÓS SER MULTIPLICADA PELO SEU PESO, A ENTRADA É SOMADA ÀS NOTAS
        //ASSIM, JÁ SERÁ FEITA A SOMA DAS NOTAS COM SEUS PESOS ANTES SER FEITA SUA MÉDIA
        notas += entrada
    }

    //COLETA DE MÉDIA
    val media: Double = calcMedia(notas)
    //ARREDONDAMENTO DA MÉDIA
    //A QUANTIDADE DE ZEROS É A MESMA DE CASAS DECIMAIS NO VALOR FINAL (LOGO, 1000.0 ARRENDONDA EM 3 CASAS)
    val mediaArredondada = (media * 100.0).roundToInt() / 100.0
    //EXIBIÇÃO DA MÉDIA
    println("Sua média é: $mediaArredondada")

    //CHECAGEM DA SITUAÇÃO DO ALUNO
    if (mediaArredondada >= 7.0) { //APROVAÇÃO, SE MAIOR OU IGUAL A 7
        println("Aluno APROVADO, com média: $mediaArredondada!")
    } else if (mediaArredondada in 5.0..6.9) { //RECUPERAÇÃO, SE NOTA ENTRE 5 E 6,9
        println("Aluno EM RECUPERAÇÃO, com média: $mediaArredondada!")
        //NOTA DA RECUPERAÇÃO
        println("Qual a nota da recuperação? (use vírgula para decimais)")
        var notaRec = scan.nextDouble()
        while ((notaRec < 0) || (notaRec > 10)) { //CHECAGEM DE NOTA VÁLIDA
            println("Valor de nota incorreto! (De preferência, de 0 a 10")
            println("Qual a nota do exame/recuperação? (use vírgula para decimais)")
            notaRec = scan.nextDouble()
        }
        val mediaFinal = (notaRec + mediaArredondada) / 2
        //RESULTADO DA RECUPERAÇÃO
        if (mediaFinal >= 5.0) { //APROVAÇÃO, SE MAIOR OU IGUAL A 5
            println("Aluno APROVADO, com média final: $mediaArredondada!")
        } else { //REPROVAÇÃO, SE MENOR QUE 5
            println("Aluno REPROVADO, com média final: $mediaArredondada!")
        }
    } else { //REPROVAÇÃO, SE MENOR QUE 5
        println("Aluno REPROVADO, com média: $mediaArredondada!")
    }
}

//CALCULA A MÉDIA PONDERADA
fun calcMedia(notas: Double): Double {
    return notas / (2 + 3 + 4 + 1) //MÉDIA DAS NOTAS PELA SOMA DOS SEUS PESOS
}