fun main() {
    a(10)
    a(false)
    b()
}

fun a(valor: Any){
    println("Valor: $valor")
}

fun b(): Unit {
    println("Função sem retorno")
}

fun c(): Nothing {
    throw Exception("Erro")
}