package ExercicioDois

class Outros {
    var outros = mutableMapOf<String, Int>()
    private var nomeOutros: String = ""
    private var grama: Int  = 0

    fun informarOutro() {
        println("Informe a  quantidade do outro :")
        var qtd = readln().toInt()
        for (i in 1..qtd) {
            println("Informe o nome do outro:")
            nomeOutros = readln()
            try {
                println("Informe a quantidade do kilo do outro")
                grama = readln().toInt()
            } catch (ex: NumberFormatException) {
                ex.message
                println("Para outro, a quantidade deve ser informada em unidades inteiras.")
            }catch (ex: UnsupportedOperationException){
                println("Não é permitido inserir valor vazio.")
            }
            outros[nomeOutros] = grama
        }
    }

    fun exibirLegumes() {
        println("------------------Legumes---------------------------")
        outros.forEach { (nome, kilo) ->
            print("$nome - $kilo kg   ")
        }
        println("\nA quantidade de alimentos do tipo verduras a ser comprada é : ${outros.size}")

    }
}