package programming

fun main() {

    val ints = listOf(1, 2, 3, 4, 5, 6)

    val odds = ints.filter { it % 2 == 1 }
    val evens = ints.filter { it % 2 == 0 }


    foo("hello") { it.reversed() }

    println(evens)
    println(odds)

    val reversi = bar()
    reversi("posadzili")

    val reversi2 = bar2()
    reversi2("bace na skraju")

    val odds2 = ints.filter(modulo(1))
    val even2 = ints.filter(modulo(2))

    println(odds2)
    println(even2)
}

fun foo(str: String, fn: (String) -> String) {
    val applied = fn(str)
    println(applied)
}

fun bar(): (String) -> String = { str -> str.reversed() }

//robi to samo co ta wyżej
fun bar2(): (String) -> String {
    return { str -> str.reversed() }
}

fun modulo(k: Int): (Int) -> Boolean = { it % k == 0 }

fun modulo2(k: Int): (Int) -> Boolean {
    return { it % k == 0 }
}
