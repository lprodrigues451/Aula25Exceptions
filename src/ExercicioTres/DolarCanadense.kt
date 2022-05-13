package ExercicioTres

import java.math.BigDecimal
import java.time.LocalDate

class DolarCanadense : Moedas(){
    override val valorCotacao = BigDecimal(3.92)
    override var nomeMoeda = "Dólar Canadense"

    fun informaValorDolarCanadense(){
        super.informaValor()
    }

    fun calcularAMoedaDolarCanadense() {
        super.calcularAMoeda()

    }

    fun mostrarOValorDolarCanadense() {
        super.mostrarOValor()
    }

    override fun menuVoltaParaCalculo(){
        println("1- SIM/ 2- NÃO")
        when(readln().toInt()){
            1->{
                informaValorDolarCanadense()
                calcularAMoedaDolarCanadense()
                mostrarOValorDolarCanadense()
            }
            2->{
                Menu().menuPrincipal()
            }

        }
    }
}