fun main() {
    foo("hello") { it.reversed() }

    println(evens)
    println(odds)

    val reversi = bar()
    reversi("posadzili")
}

fun foo(str: String, fn: (String) -> String): Unit {
    val applied = fn(str)
    println(applied)
}

val ints = listOf(1, 2, 3, 4, 5, 6)

val odds = ints.filter { it % 2 == 1 }
val evens = ints.filter { it % 2 == 0 }


fun bar(): (String) -> String = {str -> str.reversed()}

//robi to samo co ta wyżej
fun bar2(): (String) -> String {
    return { str -> str.reversed()}
}