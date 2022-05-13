package ExercicioTres
import java.math.BigDecimal

class LibraEsterlina: Moedas() {
    override val valorCotacao = BigDecimal(6.21)
    override var nomeMoeda = "Libra Esterlina"

    fun informaValorLibra(){
        super.informaValor()
    }

    fun calcularAMoedaLibra() {
        super.calcularAMoeda()

    }

    fun mostrarOValorLibra() {
        super.mostrarOValor()
    }

    override fun menuVoltaParaCalculo(){
        println("1- SIM/ 2- NÃO")
        when(readln().toInt()){
            1->{
                informaValorLibra()
                calcularAMoedaLibra()
                mostrarOValorLibra()
            }
            2->{
                Menu().menuPrincipal()
            }

        }
    }
}