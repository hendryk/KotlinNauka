package main

fun main() {
    println("Hello, World!")
    println(sum(2, 3))

    val przycisk = Button()
    przycisk.click()
}

fun sum(x: Int, y: Int) = x + y

interface Clickable {
    fun click()
}

class Button : Clickable {
    override fun click() = println("kliknąłeś mnie")
}