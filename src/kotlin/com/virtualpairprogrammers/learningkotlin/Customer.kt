package com.virtualpairprogrammers.learningkotlin

// This way it determines class, constructor and accessor with this simple way
// "data" provides another method out of the box more than only getters and setters
data class Customer (val name: String,
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
    val nextAge
    get() = age + 1

    fun toUpperCaseName() = name.toUpperCase()

    override fun toString() = "$name, $age, $address"

    // Static method in Kotlin
    companion object {
        fun getInstance() = AnotherAlternativeCustomer("Sylvanas", 45, "Fossoyeuse")
    }

    // Make variables name and age assignable in destructuring way
    operator fun component1() = name
    operator fun component2() = age

}


fun main(args: Array<String>) {
    val customer = AnotherAlternativeCustomer("Lucile",31, "Somewhere")
    customer.age = 30
    customer.approved = true

    val customer2 = AnotherAlternativeCustomer("Jo", 14)
    customer2.approved = true

    println("${customer.name} is ${customer.age} years old and is ${customer.approved}")
    println("${customer2.name} is ${customer2.age} years old and is ${customer2.approved}")
    println("Next year ${customer.toUpperCaseName()} will be ${customer.nextAge}")

    println("$customer")

    val customer3 = AnotherAlternativeCustomer.getInstance()
    println(customer3)

    val customer4 = Customer("Alleria", 22)
    println(customer4)
    // "copy" only allowed because class is a data class, can change values we want to and copy the rest
    val customer5 = customer4.copy(name="Vereesa")
    println(customer5)

    // destructuring, creating and assigning multiple variables to the field within an object
    val(name, address, age)  = customer5
    println(age)
    // destrucring -> operator component
    val (name2, age2) = customer
    println(name2)

}