package ch07.ex1_1_2_2_BinaryOperators3

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main(args: Array<String>) {
    println('a' * 3)
}
