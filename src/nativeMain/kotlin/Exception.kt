fun main5(){
    var numerador = 10
    var denominador = 1

    try {
        var res = numerador / denominador
        println(res)
    } catch (e: ArithmeticException) {
        println("Erro ao dividir por zero")
    }
}