package ExercicioTres

import java.math.BigDecimal
import java.time.LocalDate

class DolarAmericano: Moedas() {
    override val valorCotacao = BigDecimal(5.06)
    override var nomeMoeda = "Dólar Americano"

    fun informaValorDolarEUA(){
        super.informaValor()
    }

    fun calcularAMoedaDolarEUA() {
        super.calcularAMoeda()

    }

    fun mostrarOValorDolarEUA() {
        super.mostrarOValor()
    }

    override fun menuVoltaParaCalculo(){
        println("1- SIM/ 2- NÃO")
        when(readln().toInt()){
            1->{
                informaValorDolarEUA()
                calcularAMoedaDolarEUA()
                mostrarOValorDolarEUA()
            }
            2->{
                Menu().menuPrincipal()
            }

        }
    }
}