package cookbook

fun main() {
    val a: Any = 1
    val b: Any = "1"
    if (a is String) {
        println("a = $a is String--")
    } else {
        println("a = $a is not String--")
    }
    if (b is String) {
        println("b = $b is String--")
    } else {
        println("b = $b is not String--")
    }
}

