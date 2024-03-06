package org.example
import kotlin.text.toInt

fun main(){
    print("Enter number to compare to fibonacci sequence: ")
    val chosenNumber = readln()

    try {
        when{
            chosenNumber.contains(Regex("[a-zA-Z]")) -> println("Apenas números são permitidos")
            chosenNumber.isEmpty() -> println("Não existe um número para ser lido")
            else -> {
                val fibList = fibonacciSeq(chosenNumber.toInt())

                println(fibList)

                if(fibList.contains(chosenNumber.toInt())){
                    print("Número escolhido pertence a sequência fibonacci")
                } else {
                    print("Número escolhido não pertence a sequência fibonacci")
                }
            }
        }
    } catch (e: Exception) {
       println("Error message: ${e.message}")
    }
}

fun fibonacciSeq(limitFibNum: Int): List<Int> {
    var num1 = 0
    var num2 = 1
    val fibonacciList = mutableListOf(num1,num2)

    while (num1 <= limitFibNum) {
        val sum = num1 + num2
        num1 = num2
        num2 = sum
        fibonacciList.add(sum)
    }

    return fibonacciList
}