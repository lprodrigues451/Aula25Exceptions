package Exemplo

//lançamento de exceçAò
fun main() {
    println("Digite um número inteiro: ")
    val dividendo: Int = readln().toInt()

    println("Digite outro número inteiro: ")
    val divisor: Int = readln().toInt()

    if (divisor == 0) {
        throw ArithmeticException("Divisor não pode ser igual a zero")
    }

    val resultado = dividendo / divisor
    println("O resultado é: $resultado")
}