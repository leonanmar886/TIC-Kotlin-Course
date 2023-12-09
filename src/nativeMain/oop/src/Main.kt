class Main {

}
fun main() {
    val pessoa = Pessoa("John", 25)
    println(pessoa.saudacao())
    pessoa.aniversario()
    println(pessoa.saudacao())

    val pessoa2 = Pessoa("Mary", 30, "Feminino")
    println(pessoa2.saudacao())
    pessoa2.aniversario()
    println(pessoa2.saudacao())
}