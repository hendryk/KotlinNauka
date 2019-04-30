package programming

fun main() {
    println(hello("Jacek", "Placek"))

    val string = "hello"
    val length = string.take(5)
    println(length)
    Rectangle.printArea(10, 20)
    println(Rectangle.calculateArea(22, 33))

    val liczba = 123
}


fun hello(name: String, location: String): String =
    "hello to you $name at $location"

fun square(k: Int) = k * k

fun concat1(a: String, b: String) = a + b
fun concat2(a: String, b: String): String {
    return a + b

}


object Rectangle {
    fun printArea(width: Int, height: Int): Unit {
        val area = calculateArea(width, height)
        println("The area is $area")
    }

    fun calculateArea(width: Int, height: Int): Int {
        return width * height
    }
}