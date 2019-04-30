package cookbook

fun main() {
    val x = Dog()
    x.move("North")
    println(x.show(123))
}

class Dog : Zwierze() {
    init {
        println("Hey from Dog")
    }

    override fun move(direction: String) {
        println(direction)
    }
}

abstract class Zwierze {

    init {
        println("Hey from Zwierze")
    }

    abstract fun move(direction: String)
    fun show(y: Int): String {
        return y.toString()
    }

}


