package wakcji

data class Point(val x: Int, val y: Int) {

    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }


}

val p1 = Point(10, 20)
val p2 = Point(30, 40)

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Double.times(point: Point): Point {
    return Point((point.x * this).toInt(), (point.y * this).toInt())
}

fun main() {
    println(p1 * 4.5)
    println(4.5 * p1)
}