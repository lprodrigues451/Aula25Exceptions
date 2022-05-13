package ExercicioDois

import kotlin.system.exitProcess

class Menu {
    var verdura = Verdura()
    var grao = Grao()
    var legumes = Legumes()

    fun menuPrincipal() {

        println("1- Verdura")
        println("2- Grão")
        println("3- Legumes")
        println("4- Outros")
        println("5- Exibir alimento")
        println("6- Sair")
        try {
            when (readln().toInt()) {
                1 -> {
                    verdura.informarVerdura()
                    menuPrincipal()
                }
                2 -> {
                    grao.informarGrao()
                    menuPrincipal()

                }
                3 -> {
                    legumes.informarLegumes()
                    menuPrincipal()

                }

                4 -> {

                }
                5 -> {
                    verdura.exibirVerdura()
                    grao.exibirGrao()
                    legumes.exibirLegumes()
                    menuPrincipal()
                }6 -> {
                exitProcess(0)
            }

                else -> {
                    println("\n Opção Inválida \n")
                    menuPrincipal()

                }
            }
        } catch (exception: Exception){
            exception.message
        } finally {
            println("Opção invalida")
            menuPrincipal()
        }

    }
}