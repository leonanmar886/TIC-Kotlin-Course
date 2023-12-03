fun main2() {
    for (i in 1..10) {
        println(i)
    }

    for(i in 1..< 10) {
        println(i)
    }

    for(i in 10 downTo 1) {
        println(i)
    }

    for(i in 1..10 step 2) {
        println(i)
    }

    for(i in 1 until 10) {
        println(i)
    }

    val str = "Hello"
    for (c in str) {
        println(c)
    }
}
