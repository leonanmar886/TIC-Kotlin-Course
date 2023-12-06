data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main4(){
    var str:String? = null
    str = "Hello"

    str?.let {//ocorre se str for diferente de null
        println("caiu no let")
        println("tamanho de str: ${it.length}")
    }

    str?.run{
        println("caiu no run")
        println("tamanho de str: $length")
    }

    val leonan = Person("Leonan").apply {
        age = 19
        city = "Fortaleza"
    }
    println(leonan)


    val numberList = mutableListOf<Double>()
    println("Lista vazia: $numberList")
    numberList.also { println("Populando a lista") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Lista populada: $it") }
        .also { println("Ordenando a lista") }
        .sort()
        println("Lista ordenada: $numberList")

    val numbers = mutableListOf("um", "dois", "três")
    val contadorDeTerminoComO = numbers.run {
        add("quatro")
        add("cinco")
        count { it.endsWith("o") }
    }
    println("contador De Termino Com O: $contadorDeTerminoComO")

    with(numbers) {
        val primeiroItem = first()
        val ultimoItem = last()
        println("Primeiro item: $primeiroItem, último item: $ultimoItem")
    }
}