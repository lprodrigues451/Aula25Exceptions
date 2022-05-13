package ExercicioDois

class Legumes {
    var legumes = mutableMapOf<String, Int>()
    private var nomeLegumes: String = ""
    private var grama: Int  = 0

    fun informarLegumes() {
        println("Informe a  quantidade de Legumes :")
        var qtd = readln().toInt()
        for (i in 1..qtd) {
            println("Informe o nome do legumes:")
            nomeLegumes = readln()
            try {
                println("Informe a quantidade do kilo do Legumes")
                grama = readln().toInt()
            } catch (ex: NumberFormatException) {
                ex.message
                println("Para legume, a quantidade deve ser informada em unidades inteiras.")
            }catch (ex: UnsupportedOperationException){
                println("Não é permitido inserir valor vazio.")
            }
            legumes[nomeLegumes] = grama
        }
    }

    fun exibirLegumes() {
        println("------------------Legumes---------------------------")
        legumes.forEach { (nome, kilo) ->
            print("$nome - $kilo kg   ")
        }
        println("\nA quantidade de alimentos do tipo verduras a ser comprada é : ${legumes.size}")

    }
}