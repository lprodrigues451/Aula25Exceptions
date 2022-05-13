package ExercicioTres

import java.math.BigDecimal
import java.time.LocalDate

abstract class Moedas {
    var valorInserido = BigDecimal(0.0)
    var valorConvertido = BigDecimal(0.0)
    abstract val valorCotacao : BigDecimal
    abstract var nomeMoeda : String

   protected fun informaValor(): BigDecimal {
        try {
            println("Informe  o valor do $nomeMoeda")
            valorInserido = readln().toBigDecimal()
            valorNegativoOuZero()

        }catch (exception: NumberFormatException){
            println("Para $nomeMoeda, o valor monetário deve ser um número decimal.")
            informaValor()
        }
        return valorInserido
    }

    protected fun valorNegativoOuZero(){
        if (valorInserido <= BigDecimal.ZERO){
            println("Valor inválido, por favor, tente novamente")
            informaValor()
        }
    }
    protected fun calcularAMoeda() {
        valorConvertido = valorInserido * valorCotacao

    }

    protected fun mostrarOValor() {
        println("O $nomeMoeda na cotação de hoje ${LocalDate.now()} está em $valorCotacao,\n " +
                "o valor que pediu para converter de $valorInserido em reais é R$ $valorConvertido.\n")
        menuVoltaParaCalculo()
    }

    abstract fun menuVoltaParaCalculo()

}