package heranca;

open class Eletronico(val nome: String, val tensao: Int) {
    open fun ligar() {
        println("Ligando o $nome na tensão $tensao")
    }

    open fun desligar() {
        println("Desligando o $nome na tensão $tensao")
    }
}
