package ExercicioTres

import java.math.BigDecimal
import java.time.LocalDate

class Euro : Moedas() {
    override val valorCotacao = BigDecimal(5.27)
    override var nomeMoeda = "Euro"

     fun informaValorEuro(){
         super.informaValor()
         }

    fun calcularAMoedaEuro() {
       super.calcularAMoeda()

    }

    fun mostrarOValorEuro() {
       super.mostrarOValor()
    }

    override fun menuVoltaParaCalculo(){
        println("1- SIM/ 2- NÃO")
        when(readln().toInt()){
            1->{
                informaValorEuro()
                calcularAMoedaEuro()
                mostrarOValorEuro()
            }
            2->{
                Menu().menuPrincipal()
            }

        }
    }
}