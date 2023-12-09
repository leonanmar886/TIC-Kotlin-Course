class Pessoa(val nome: String, var idade: Int) {
    var sexo: String? = null

    constructor(nome: String, idade: Int, sexo: String) : this(nome, idade) {
        println("Construtor secundário")
        this.sexo = sexo
    }
    fun aniversario() {
        idade++
    }

    fun saudacao() {
        println("Olá, meu nome é $nome, sou do sexo $sexo e tenho $idade anos")
    }
}