package programming

fun main() {

    val ints = listOf(1, 2, 3, 4, 5)

    fun isEven3(k: Int): Boolean = k % 2 == 0

    val zz = fun (k: Int): Boolean = k % 2 == 0

    val refer: (x:Int) -> Boolean = ::isEven3

    val isEven5 : (Int) -> Boolean = { it % 2 == 0 }

    ints.filter { isEven3(it) }
    ints.filter(::isEven3)
    ints.filter(refer)
    ints.filter(isEven5)
    ints.filter(zz)


}

