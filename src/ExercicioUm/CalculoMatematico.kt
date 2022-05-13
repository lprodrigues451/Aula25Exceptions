package ExercicioUm

class CalculoMatematico {
    var divisaoFinal: Int = 0

    fun divisao(numeroA: Int, numeroB: Int): Int {
        try {
            divisaoFinal = numeroA / numeroB

        } catch (exception: ArithmeticException) {
            println(exception.message)
            println("A operação não pode ser realizada")
        }
        return divisaoFinal
    }
}
