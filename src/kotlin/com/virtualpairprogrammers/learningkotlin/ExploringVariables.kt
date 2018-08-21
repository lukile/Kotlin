package com.virtualpairprogrammers.learningkotlin

import java.math.BigDecimal
import kotlin.math.*


/**
 * Created on 14/08/2018.
 */
fun main(args: Array<String>) {
    val myDouble = 12.3

    //boolean check if variable type is equal to one type
    println("Is myDouble is myDouble value? ${myDouble is Double}")

    //name of val class name
    println("myDouble class ${myDouble::class.qualifiedName}")

    //name of val class name in java
    println("myDouble in java class ${myDouble.javaClass}")


    //Convert to int
    val myInteger = myDouble.roundToInt()
    println("double round to Int ${myInteger::class.qualifiedName}")

    val anotherInteger : Int = 17

    val myFloat : Float = 14.7f

    val result = anotherInteger.plus(myFloat)

    println("result is : $result")

    val bd = BigDecimal(17)

    val bd2 : BigDecimal

    bd2 = bd.add(BigDecimal(30))

    println(bd2)

    var name = "Walter"
    val surname = "White"

    name = "Wally"

    println("Hello $name ${surname.toUpperCase()}")
    println("The \$name variables has ${name.length} characters")

    val story = """Walter was a discrete chemical professor.
        |One day he learned he's got a lung cancer.
        |To pay his chemotherapy he started to make his own drug.""".trimMargin("|")

    println(story)

    val changeStory = story.replaceAfterLast("to", " become Eisenbergh")

    println(changeStory)
}