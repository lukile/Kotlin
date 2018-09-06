package com.virtualpairprogrammers.learningkotlin

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {

    var result: Any

    val randomNumber = Random().nextInt(3)

    if (randomNumber == 1) {
        result = BigDecimal(40)
    } else {
        result = "hello"
    }

    System.out.println("Result is $result" )

    if (result is BigDecimal) {
        result = result.add(BigDecimal(77))
    } else {
        val tempResult = result as String
        result = tempResult.toUpperCase()
    }

    System.out.println("Result is $result")
}
