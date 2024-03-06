package org.example

fun main() {
    val normalString = readln()
    val invertedString = invertString(normalString)

    when{
        normalString.contains(Regex("^\\s*\$")) -> println("Valor contém apenas espaços vazios")
        normalString.isEmpty() -> println("Valor inserido está vazio, portanto não pode ser revertida")
        else -> {
            println(normalString)
            println(invertedString)
        }
    }
}

fun invertString(userString: String): String{
    var inverted = ""

    for (i in userString.length - 1 downTo 0) {
        inverted += userString[i]
    }
    return inverted
}