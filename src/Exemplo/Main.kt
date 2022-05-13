package Exemplo

fun main() {
    try {
        val divisao = 4/0
        println(divisao)
    }catch (exception: Exception){
        println(exception.message)
        println("Deu ruim a divisão caiu no bloco catch ")
    } finally {
        println("Essa mensagem é do bloco finally!")
    }
}