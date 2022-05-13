package ExercicioTres

import kotlin.system.exitProcess

class Menu {
    var euro = Euro()
    var dolarEUA = DolarAmericano()
    var dolarCa = DolarCanadense()
    var libra = LibraEsterlina()
    init {
        println("Boas vindas ao conversor de moedas")
    }
    fun menuPrincipal() {
        println("----------------------")
        println("| 1- Dólar americano |")
        println("| 2- Dólar canadense |")
        println("| 3- Euro            |")
        println("| 4- Libra esterlina |")
        println("| 5- Sair            |")
        print(  "Informe o valor:  ")
        try {
            when (readln().toInt()) {
                1 -> {
                    println(MOEDA_REAL_CONVERTIDA)
                    dolarEUA.informaValorDolarEUA()
                    dolarEUA.calcularAMoedaDolarEUA()
                    dolarEUA.mostrarOValorDolarEUA()
                }
                2 -> {
                    println(MOEDA_REAL_CONVERTIDA)
                    dolarCa.informaValorDolarCanadense()
                    dolarCa.calcularAMoedaDolarCanadense()
                    dolarCa.mostrarOValorDolarCanadense()
                }
                3 -> {
                    println(MOEDA_REAL_CONVERTIDA)
                    euro.informaValorEuro()
                    euro.calcularAMoedaEuro()
                    euro.mostrarOValorEuro()
                }

                4 -> {
                    println(MOEDA_REAL_CONVERTIDA)
                    libra.informaValorLibra()
                    libra.calcularAMoedaLibra()
                    libra.mostrarOValorLibra()
                }
                5 -> {
                exitProcess(0)
            }

                else -> {
                    println("\n Opção Inválida \n")
                    menuPrincipal()

                }
            }
        } catch (exception: IllegalAccessException){
            println("Tipo de moeda inválido")
            menuPrincipal()
        }

    }
}