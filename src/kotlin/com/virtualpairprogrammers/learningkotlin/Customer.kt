package com.virtualpairprogrammers.learningkotlin

// This way it determines class, constructor and accessor with this simple way
class Customer (val name: String,
                val address: String,
                var age: Int) {

    //Second constructor, call the fist one
    constructor(name: String, age: Int) : this(name, "", age)
}

class AlternativeCustomer (val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

// Exactly the same as the Customer class
class AnotherAlternativeCustomer (val name: String,  var age: Int, val address: String = "") {
    var approved: Boolean = false

    //Overriding set method
    set(value) {
        if(age >= 21) {
            field = value
        } else {
            println("You can't approved a customer under 21 years old")
        }
    }
}


fun main(args: Array<String>) {
    val customer = AnotherAlternativeCustomer("Lucile",31, "Somewhere")
    customer.age = 30
    customer.approved = true

    val customer2 = AnotherAlternativeCustomer("Jo", 14)
    customer2.approved = true

    println("${customer.name} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
}