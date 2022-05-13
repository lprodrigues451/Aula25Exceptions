package ExercicioDois

class Verdura {
    private var verdura = mutableMapOf<String, Double>()
    private var nomeVerdura: String = ""
    private var grama: Double = 0.0

    fun informarVerdura(){
            println("Informe a  quantidade de verdura :")
            val qtd = readln().toInt()
            for (i in 1 .. qtd){
                println("Informe o nome da verdura:")
                nomeVerdura = readln()
                try {
                println("Informe a quantidade do kilo da verdura")
                    grama = readln().toDouble()
                } catch (ex: NumberFormatException){
                    println("Para verdura, a quantidade deve ser informada com ponto")
                } catch (ex: UnsupportedOperationException){
                    println("Não é permitido inserir valor vazio.")
                }
                verdura[nomeVerdura]= grama
            }
    }

    fun exibirVerdura(){
        println("------------------Verdura---------------------------")
        verdura.forEach { (nome, kilo) ->
            print("$nome - $kilo kg ")
        }
        println("\nA quantidade de alimentos do tipo verduras a ser comprada é : ${verdura.size}")

    }
}