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

    val planeta = Planeta("Terra")
    planeta.setMassa(5.972e24)
    planeta.setRaio(6371.0)

    for (f in Funcoes.entries) {
        println("As funções disponíveis são: $f")
    }

    for (a in Arma.values()) {
        println("A arma de um $a é ${a.arma}")
    }
}