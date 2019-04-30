package cookbook

import java.math.BigDecimal

fun main() {
    println(big)
    println()

    val zmienna:Int = 123

}

private val Int.BD: BigDecimal
    get() {
        return BigDecimal(this)
    }


val big = 10.BD