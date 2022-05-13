package ExercicioDois

class Grao {
    var grao = mutableMapOf<String, Double>()
    private var nomeGrao: String = ""
    private var grama: Double = 0.0

    fun informarGrao() {
        println("Informe a  quantidade de Grão :")
        var qtd = readln().toInt()
        for (i in 1..qtd) {
            println("Informe o nome do grão:")
            nomeGrao = readln()
            try {
                println("Informe a quantidade do kilo do grão")
                grama = readln().toDouble()
            } catch (ex: NumberFormatException) {
                ex.message
                println("Para grão , a quantidade deve ser informada com ponto")
            }catch (ex: UnsupportedOperationException){
                println("Não é permitido inserir valor vazio.")
            }
            grao[nomeGrao] = grama
        }
    }

    fun exibirGrao() {
        println("------------------Grão---------------------------")
        grao.forEach { (nome, kilo) ->
            print("$nome - $kilo kg   ")
        }
        println("\nA quantidade de alimentos do tipo verduras a ser comprada é : ${grao.size}")

    }

}