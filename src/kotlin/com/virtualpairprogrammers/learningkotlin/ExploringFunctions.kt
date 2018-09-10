package com.virtualpairprogrammers.learningkotlin

//Not forced to declare class, functions can exist outside a class file

//Public and static by default

private fun printAString(value: String) =
    println(value)

fun addTwoNumbers(one: Double = 2.0, two: Double = 3.0) =
    one + two

fun printSomeMaths(one: Double, two: Double) {
    //parameters are immutable
    println("one + two is ${one + two}")
    println("one - two is ${one - two}")

    //Function only visible in her parent function
    fun functionWithinFunction(word: String) {
        println(word)
    }

    functionWithinFunction("Hi")

}

/* In Java style, for method takes lamba as parameter
  fun  methodHasLamba (input: String, action: java.util.function.Function<String, Int>) {
       println(action.apply(input))
  }*/

/* Apply to Kotlin style
    fun methodHasLambda(input: String, action : (String) -> Int) {
        println(action(input))
    }
* */

fun main(args: Array<String>) {
    printAString("Hello World !")

   println(addTwoNumbers(1.0, 2.0))

    //two is replaced by default value
    println(addTwoNumbers(6.3))

    //Explicitly pass parameters order
    printSomeMaths(two = 1.0, one = 2.0)

    //One is replaced by default value and two is explicitly replaced
    println(addTwoNumbers(two = 2.4))

}