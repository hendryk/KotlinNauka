package programming

data class Roots(var pos: Double, var neg: Double)

fun roots2(k: Int): Roots {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())
    return Roots(root, -root)
}

fun roots3(k: Int): Pair<Double, Double> {
    require(k >= 0)
    val root = Math.sqrt(k.toDouble())
    return Pair(root, -root)
}

fun positiveRoot(k: Int): Double {
    require(k >= 0)
    return Math.sqrt(k.toDouble())
}

fun negativeRoot(k: Int): Double {
    require(k >= 0)
    return -Math.sqrt(k.toDouble())
}

class InfixAccount {
    var balance = 0.0
    infix fun add(amount: Double) {
        this.balance = balance + amount
    }

    infix fun add(amount: Int) {
        this.balance = balance + amount
    }
}



fun main() {
    println(positiveRoot(12))
    println(roots2(11))
    println(roots3(11))

    val konto = InfixAccount()
    konto add 100.0
    println(konto.balance)
    konto add 200
    println(konto.balance)
}