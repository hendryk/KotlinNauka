package main

import java.math.BigDecimal

fun main() {
    println("Start programu następuje")

    val l = listOf(55, 44, 3, 4, 5)
    println(l.sorted())
    println(l)

    val test = Square(BigDecimal("5.2"))
    println(test.area())
    println(test.simpleDescription())


}

open class NamedShape {
    var numberOfSides = 0

    open fun simpleDescription() =
        "A shape with $numberOfSides sides."
}

class Square(var sideLength: BigDecimal) : NamedShape() {
    init {
        numberOfSides = 4
    }

    fun area() = sideLength.pow(2)

    override fun simpleDescription() =
        "A square with sides of length $sideLength."
}