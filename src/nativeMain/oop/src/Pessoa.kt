class Pessoa(val nome: String, var idade: Int) {
    fun aniversario() {
        idade++
    }

    fun saudacao() {
        println("Olá, meu nome é $nome e tenho $idade anos")
    }
}