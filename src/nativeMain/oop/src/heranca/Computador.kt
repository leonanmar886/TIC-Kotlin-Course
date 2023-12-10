package heranca

class Computador(nome: String, tensao: Int) : Eletronico(nome, tensao){
    var ligado: Boolean = false
    var processador: String = ""
    var memoria: Int = 0

    constructor(nome: String, tensao: Int, processador: String, memoria: Int) : this(nome, tensao) {
        this.processador = processador
        this.memoria = memoria
    }

    override fun ligar() {
        if (!ligado) {
            ligado = true
            println("Ligando o computador com processador $processador e memória $memoria")
        } else {
            println("O computador já está ligado")
        }
    }

    override fun desligar() {
        if (ligado) {
            ligado = false
            println("Desligando o computador com processador $processador e memória $memoria")
        } else {
            println("O computador já está desligado")
        }
    }
}