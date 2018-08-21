package com.virtualpairprogrammers.learningkotlin

/**
 * Created on 14/08/2018.
 */
fun main(args: Array<String>) {
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