package Exemplo

fun main() {

    try {
        println("Digite um número inteiro: ")
        val dividendo: Int = readln().toInt()

        println("Digite outro número inteiro: ")
        val divisor: Int = readln().toInt()

        val resultado = dividendo / divisor
        println("O resultado é: $resultado")

    } catch (exception: ArithmeticException) {
        println("Causa: ${exception.cause}")
        println("Mensagem: ${exception.message}")
        //exception.printStackTrace()
    } catch (exception : NumberFormatException){
        println("Causa: ${exception.cause}")
        println("Mensagem: ${exception.message}")
    }
    finally {
        println("Obrigado por usar o sistema!")
    }
}