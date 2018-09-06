package com.virtualpairprogrammers.learningkotlin

fun main(args: Array<String>) {
    var name: String? = null

    println(name?.toUpperCase())

    // /!\ will throw an KotlinNullPointerException because !! asserts NULL
    println(name!!.toUpperCase())

    //Type var is "Nothing"
    var address = null

    //Error because we can't reassign type to a variable of type "Nothing"
    address = "Hello"

    //Even if it's not explicitly typed, it considers "7" value is Int type
    var myIntger = 7

    //Not possible for the reason mentionned before
    myIntger = null



}