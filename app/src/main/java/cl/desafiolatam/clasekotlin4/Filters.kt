package cl.desafiolatam.clasekotlin4

fun main () {

    val numbers = listOf(4,6,-2,-6,10,1000)

    // los siguientes 2 codigos, cumplen la misma funcion
    val filter = numbers.filter { number -> number > 0 }
    val filterAlt = numbers.filter { it > 0 }
    println(filter)

    val words = listOf("primero", "segundo", "tercero", "corto", "largo")

    val filterWords = words.filter { it.length > 5 }
        println(filterWords)

}