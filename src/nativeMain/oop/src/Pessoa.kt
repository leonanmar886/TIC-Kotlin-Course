class Pessoa(val nome: String, var idade: Int) {
    var sexo: String? = null
    val filhos: MutableList<Pessoa> = mutableListOf()

    constructor(nome: String, idade: Int, sexo: String, pai: Pessoa, mae: Pessoa) : this(nome, idade, sexo) {
        pai.filhos.add(this)
        mae.filhos.add(this)
    }

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