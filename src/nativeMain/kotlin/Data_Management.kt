fun main(){
    var str: String? = null
    println(str?.length)
    str = "Hello"
    println(str!!.length)
    println("Hello, Kotlin/Native!")

    val input = readLine()
    println("Hello, $input!")
}